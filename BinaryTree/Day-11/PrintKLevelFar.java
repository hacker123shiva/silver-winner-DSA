import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class PrintKLevelFar {
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
        System.out.println("PreOrderTraversal");
        preOrderTraversal(root);
        System.out.println("\nInOrderTravesal");
        inOrderTraversal(root);
        System.out.println("\nPostOrderTravesal");
        postOrderTraversal(root);
        System.out.println("\nLevelOrderTraversal");
        levelOrderTraversal(root);

        System.out.println();
        iterativeTraversal(root);

        path=new ArrayList<>();

       boolean res=find(root, 70);
       System.out.println(res);
       System.out.println(path);

       printKLevelsDown(root, 2);
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

    public static void preOrderTraversal(Node node){
       if(node==null){
        return;
       }
        System.out.print(node.data+"->");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }

    public static void postOrderTraversal(Node node){
        if(node==null){
         return;
        }
        
         postOrderTraversal(node.left);
         postOrderTraversal(node.right);
         System.out.print(node.data+"->");
 
     }

     public static void inOrderTraversal(Node node){
        if(node==null){
         return;
        }
        
         inOrderTraversal(node.left);
         System.out.print(node.data+"->");
         inOrderTraversal(node.right);
         
 
     }

     public static void levelOrderTraversal(Node node){
      
        Queue<Node> queue=new ArrayDeque<>();

        //remove its parent

        //print root 

        //add child elements to queue

        
        queue.add(node);
        while(queue.size()>0){

            int count=queue.size();

            for(int i=1;i<=count;i++){
            Node n=queue.poll();

            System.out.print(n.data+"->");
            if(n.left!=null)
            queue.add(n.left);

            if(n.right!=null)
            queue.add(n.right);
            }
          
            System.out.println();
        }


   
     }

     public static void iterativeTraversal(Node node){
        
        Stack<Pair> st=new Stack<>();
        Pair rtp=new Pair(node,1);

        String pre="";
        String in="";
        String post="";

        st.push(rtp);
        while(st.size()>0){
            Pair top=st.peek();
            if(top.state==1){//pre, state++, left
            pre+=""+top.node.data+"->";
            top.state++;
            if(top.node.left!=null)
            {
            Pair lc=new Pair(top.node.left,1);
            st.push(lc);
            }

            }else if(top.state==2){// in, state++, right
            in+=""+top.node.data+"->";
            top.state++;
            if(top.node.right!=null)
            {
            Pair rc=new Pair(top.node.right,1);
            st.push(rc);
            }
            }else{//post, pop
             post+=""+top.node.data+"->";
             st.pop();
            
            }
        }

        System.out.println("PreOrder Interative");
        System.out.println(pre);
        System.out.println("Inorder Iterative");
        System.out.println(in);
        System.out.println("PostOrder Iterative");
        System.out.println(post);
     }  

    static ArrayList<Node> path;
     public static boolean find(Node node,int data){
if(node==null){
    return false;
}

        if(node.data==data){
            path.add(node);
            return true;
        }

        boolean lns=find(node.left,data);
        if(lns){
            path.add(node);
            return true;
        }

        boolean rns=find(node.right,data);
        if(rns){
            path.add(node);
            return true;
        }

        return false;
     }

     public static void printKLevelsDown(Node node, int k){

        if(node==null || k<0){
          return ;
        }

        if(k==0){
            System.out.print(node.data+"-");
        }
        printKLevelsDown(node.left, k-1);
        printKLevelsDown(node.right, k-1);


     } 
}
