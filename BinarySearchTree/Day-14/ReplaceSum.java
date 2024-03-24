
public class ReplaceSum {
    static int sum = 0;

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
        System.out.println("Size of BST: " + size(root));
        System.out.println("Sum of node: " + sum(root));
        System.out.println("Max of BST: " + max(root));
        System.out.println("Min of BST: " + min(root));
        System.out.println("Value exit  " + find(root, 87));
        System.out.println("Value exit  " + find(root, 100));
        rwsol(root);
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

    public static int size(Node node) {
        if (node == null)
            return 0;

        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;

        return ts;

    }

    public static int sum(Node node) {
        if (node == null)
            return 0;

        int ls = sum(node.left);
        int rs = sum(node.right);
        int ts = ls + rs + node.data;
        return ts;

    }

    public static int max(Node node) {
        if (node == null)
            return 0;
        if (node.right != null) {
            return max(node.right);
        } else {
            return node.data;
        }
    }

    public static int min(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        if (node.left != null) {
            return min(node.left);
        } else {
            return node.data;
        }
    }

    public static boolean find(Node node, int value) {
        if (node == null)
            return false;

        if (node.data == value)
            return true;
        else if (node.data < value) {
            return find(node.right, value);
        } else {
            return find(node.left, value);
        }
    }

    public static Node add(Node node, int data) {
        if (node == null) {
            return new Node(data, null, null);
        }
        if (data > node.data) {
            node.right = add(node.right, data);
        } else if (data < node.data) {
            node.left = add(node.left, data);
        } else {
            // nothing
        }
        return node;

    }

    // 0 child , 1L child, 1R child, 2 child
    public static Node remove(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (data > node.data) {
            node.right = remove(node.right, data);
        } else if (data < node.data) {
            node.left = remove(node.left, data);
        } else {
            if (node.left != null && node.left != null) {
                int lmax = max(node.left);
                node.data = lmax;
                node.left = remove(node.left, lmax);
                return node;

            } else if (node.right != null) {
                return node.right;
            } else if (node.left != null) {
                return node.left;
            } else {
                return null;
            }
        }

        return node;
    }

    public static void rwsol(Node node) {
        if (node == null)
            return;

        rwsol(node.right);
        int tmp = node.data;
        node.data = sum;
        sum += tmp;
        rwsol(node.left);
    }
}
