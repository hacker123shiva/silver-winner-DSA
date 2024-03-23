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
    public List<Integer> preorderTraversal(TreeNode root) {

        // base case
        if (root == null)
            return new ArrayList<>();

        // recursive case
        List<Integer> ls = new ArrayList<>();
        int pre = root.val;
        List<Integer> l = preorderTraversal(root.left);
        List<Integer> r = preorderTraversal(root.right);

        ls.add(pre);
        ls.addAll(l);
        ls.addAll(r);

        return ls;
    }
}
