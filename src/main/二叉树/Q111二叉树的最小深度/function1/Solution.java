package 二叉树.Q111二叉树的最小深度.function1;

import 二叉树.Q111二叉树的最小深度.TreeNode;

/**
 * @ClassName: Solution
 * @Description:
 * @Author: duc
 * @Date: 2022/2/24 11:36 AM
 * @Version: V1.0
 **/
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int res = Integer.MAX_VALUE;
        if (root.left != null) {
            res = Math.min(minDepth(root.left), res);
        }
        if (root.right != null) {
            res = Math.min(minDepth(root.right), res);
        }
        return res + 1;
    }
}
