package 二叉树.Q111二叉树的最小深度;

/**
 * @ClassName: TreeNode
 * @Description:
 * @Author: duc
 * @Date: 2022/2/23 6:52 PM
 * @Version: V1.0
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
