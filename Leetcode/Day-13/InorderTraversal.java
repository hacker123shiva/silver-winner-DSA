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
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<Integer> ls = new ArrayList<>();

        List<Integer> l = inorderTraversal(root.left);
        ls.addAll(l);

        int inor = root.val;
        ls.add(inor);

        List<Integer> r = inorderTraversal(root.right);
        ls.addAll(r);

        return ls;
    }
}