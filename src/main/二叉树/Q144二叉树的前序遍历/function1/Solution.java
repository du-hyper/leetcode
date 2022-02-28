package 二叉树.Q144二叉树的前序遍历.function1;

import 二叉树.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution
 * @Description: 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * @Author: duc
 * @Date: 2022/2/27 5:48 PM
 * @Version: V1.0
 **/
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode treeNode, List<Integer> res) {
        if (treeNode == null) {
            return;
        }

        res.add(treeNode.val);
        preorder(treeNode.left, res);
        preorder(treeNode.right, res);
    }

}
