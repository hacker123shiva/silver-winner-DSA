import java.util.Stack;

public class Constructor {
 
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
        }

        
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }

        @Override
        public String toString() {
            return "Pair [node=" + node + ", state=" + state + "]";
        }

    }

    public static void main(String[] args) {
        
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Stack<Pair> st = new Stack<>();

        Node root = new Node(arr[0], null, null);
        Pair rp = new Pair(root, 1);
        st.push(rp);

        int idx = 0;
        while (!st.isEmpty()) {
          
           Pair top = st.peek();

           if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    Node lnode = new Node(arr[idx], null, null);
                    st.peek().node.left = lnode;
                    st.peek().state = 2;
                    Pair p = new Pair(lnode, 1);
                    st.push(p);
                } else {
                    st.peek().node.left = null;
                    st.peek().state = 2;
                }
           } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    Node rnode = new Node(arr[idx], null, null);
                    st.peek().state = 3;
                    st.peek().node.right = rnode;
                    Pair p = new Pair(rnode, 1);
                    st.push(p);
                } else {
                    st.peek().node.right = null;
                    st.peek().state = 3;
                }
           } else {
                System.out.print(st.pop().node.data + " "); // Print the data of the popped node
           }
        }
        System.out.println(root);
    }
}
