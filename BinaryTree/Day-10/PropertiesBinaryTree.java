import java.util.Stack;

public class PropertiesBinaryTree {
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
       
        display(root);
        System.out.println("Size: "+ size(root));
        System.out.println("Height: "+height(root));
        System.out.println("Max: "+ max(root));
        System.out.println("Sum: "+ sum(root));

    } 
    
    public static void display(Node node){
        //node self work
        if(node==null)
        return;
String str="";
str +=node.left==null?".":node.left.data;
str +="<-"+node.data+"->";
str +=node.right==null?".":node.right.data;
System.out.println(str);
        display(node.left);
        display(node.right);
    }


    public static int size(Node node){
      //base case
      if(node ==null){
        return 0;
      }

        int ls=size(node.left);
        int rs=size(node.right);
        int ts=ls+rs+1;
        return ts;
    }

    public static int sum(Node node){
        //base case
       if(node==null)
       return 0;

        int lsm=sum(node.left);
        int rsm=sum(node.right);
        int tsm=lsm+rsm+node.data;
        return tsm;
    }

    public static int max(Node node){
    
        if(node==null)
        return Integer.MIN_VALUE;

        int lmax=max(node.left);
        int rmax=max(node.right);
        
        int m=Math.max(Math.max(lmax,node.data),rmax);
        return m;

    }

    public static int height(Node node){
    
        if(node==null)
        return -1; //edges -1 and node 0

        int h=Math.max(height(node.left),height(node.right))+1;
        return h;
    } 
}
