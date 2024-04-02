import java.util.HashMap;
// Memomry limit exceed
 class Solution {
    class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object ob) {
            Node node = (Node) ob;
            return this.x == node.x && this.y == node.y;
        }

        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }

    public HashMap<Node, Boolean> memo = new HashMap<>();

    public boolean reachingPointsv(int sx, int sy, int tx, int ty,boolean visited[][]) {
        Node node = new Node(sx, sy);
        if (memo.containsKey(node)) {
            return memo.get(node);
        }

        if (sx == tx && sy == ty) {
            return true;
        }

        if (sx > tx || sy > ty|| visited[sx][sy]==true) {
            return false;
        }

        // Recursively check reachingPoints
        visited[sx][sy]=true;
        boolean first = reachingPointsv(sx + sy, sy, tx, ty,visited);
        boolean second = reachingPointsv(sx, sy + sx, tx, ty,visited);
        visited[sx][sy]=false;

        boolean result = first || second;
        memo.put(node, result);
        return result;
    }

     public boolean reachingPoints(int sx, int sy, int tx, int ty) {
         boolean [][]visited=new boolean[tx+1][ty+1];
        
        return reachingPointsv(sx,sy,tx,ty,visited);
    }
}
