
import java.util.Stack;

public class BSTConstruct {
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

    public static Node construct(int[] arr, int lo, int hi) {
        if (lo > hi)
            return null;

        int mid = (lo + hi) / 2;
        int data = arr[mid];
        Node left = construct(arr, lo, mid - 1);
        Node right = construct(arr, mid + 1, hi);

        Node node = new Node(data, left, right);
        return node;

    }

    public static void main(String[] args) {
        int[] arr = { 12, 25, 37, 50, 62, 75, 87 };
        Node root = construct(arr, 0, arr.length - 1);
        display(root);
    }

    public static void display(Node node) {
        // node self work
        if (node == null)
            return;
        String str = "";
        str += node.left == null ? "." : node.left.data;
        str += "<-" + node.data + "->";
        str += node.right == null ? "." : node.right.data;
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

}

/*
 * PS D:\DSA-Challenge\silver-winner-DSA\BinarySearchTree> javac
 * .\BSTConstruct.java
 * PS D:\DSA-Challenge\silver-winner-DSA\BinarySearchTree> java BSTConstruct
 * 25<-50->75
 * 12<-25->37
 * .<-12->.
 * .<-37->.
 * 62<-75->87
 * .<-62->.
 * .<-87->.
 */