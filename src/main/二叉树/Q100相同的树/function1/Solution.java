package 二叉树.Q100相同的树.function1;

import 二叉树.Q100相同的树.TreeNode;

/**
 * @ClassName: Solution
 * @Description: 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * @Author: duc
 * @Date: 2022/2/24 11:02 AM
 * @Version: V1.0
 **/
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p, q);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return Boolean.TRUE;
        }
        if (p == null || q == null) {
            return Boolean.FALSE;
        }
        return p.val == q.val && check(p.left, q.left) && check(p.right, q.right);
    }
}
