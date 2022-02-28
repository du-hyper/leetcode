package 二叉树.Q110平衡二叉树.function1;

import 二叉树.common.TreeNode;

/**
 * @ClassName: Solution
 * @Description: 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *               本题中，一棵高度平衡二叉树定义为： 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 * @Author: duc
 * @Date: 2022/2/27 6:12 PM
 * @Version: V1.0
 **/
public class Solution {


    public boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return Boolean.TRUE;
        }

        return Math.abs(getTreeHeight(root.left) - getTreeHeight(root.right)) <= 1;
    }

    public int getTreeHeight(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return Math.max(getTreeHeight(treeNode.left), getTreeHeight(treeNode.right)) + 1;
    }
}
