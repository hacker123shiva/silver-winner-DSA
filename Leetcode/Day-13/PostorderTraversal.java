import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // base case
        if (root == null)
            return new ArrayList<>();

        // recursive case
        List<Integer> ls = new ArrayList<>();
        List<Integer> l = postorderTraversal(root.left);
        List<Integer> r = postorderTraversal(root.right);
        int post = root.val;

        ls.addAll(l);
        ls.addAll(r);
        ls.add(post);

        return ls;

    }
}