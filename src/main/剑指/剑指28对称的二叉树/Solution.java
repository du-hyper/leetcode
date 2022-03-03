package 剑指.剑指28对称的二叉树;

import 剑指.common.TreeNode;

/**
 * @ClassName: Solution
 * @Description: 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * @Author: duc
 * @Date: 2022/3/3 3:19 PM
 * @Version: V1.0
 **/
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkNode(root.left, root.right);
    }

    public boolean checkNode(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && checkNode(p.left, q.right) && checkNode(p.right, q.left);
    }
}
