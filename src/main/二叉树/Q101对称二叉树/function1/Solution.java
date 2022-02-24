package 二叉树.Q101对称二叉树.function1;

import 二叉树.Q101对称二叉树.TreeNode;

/**
 * @ClassName: Solution
 * @Description: 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * @Author: duc
 * @Date: 2022/2/23 7:12 PM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        TreeNode r = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(3);
        TreeNode r5 = new TreeNode(4);
        TreeNode r6 = new TreeNode(4);

        r1.left = r3;
        r1.right = r5;
        r2.left = r6;
        r2.right = r4;
        r.left = r1;
        r.right = r2;

        Solution solution = new Solution();
        System.out.println(solution.isSymmetric(r));
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return Boolean.TRUE;
        }
        if (p == null || q == null) {
            return Boolean.FALSE;
        }
        return p.val == q.val && check(p.right, q.left) && check(p.left, q.right);
    }
}
