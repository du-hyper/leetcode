package 二叉树.Q94二叉树的中序遍历;

/**
 * @ClassName: TreeNode
 * @Description:
 * @Author: duc
 * @Date: 2022/2/23 6:52 PM
 * @Version: V1.0
 **/
public class TreeNode {
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
