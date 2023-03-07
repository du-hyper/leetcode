package tree.n94;

import tree.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r = new TreeNode(2);
        TreeNode l = new TreeNode(3);
        r.left = l;
        root.right = r;

        List<Integer> res = inorderTraversal(root);
        res.forEach(e -> System.out.println(e));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        if(root.left != null) {
            res.addAll(inorderTraversal(root.left));
        }
        res.add(root.val);
        if(root.right != null) {
            res.addAll(inorderTraversal(root.right));
        }
        return res;
    }
}
