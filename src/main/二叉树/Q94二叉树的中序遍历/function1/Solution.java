package 二叉树.Q94二叉树的中序遍历.function1;

import 二叉树.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution
 * @Description: 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 * @Author: duc
 * @Date: 2022/2/23 6:52 PM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;

        List<Integer> res = solution.inorderTraversal(t1);
        res.stream().forEach(e -> System.out.println(e));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode e, List<Integer> res) {
        if (e == null) {
            return;
        }
//        res.add(e.val); // 前序遍历位置
        inorder(e.left, res);
        res.add(e.val); // 中序遍历位置
        inorder(e.right, res);
//        res.add(e.val); // 后序遍历位置
    }
}
