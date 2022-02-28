package 二叉树.common;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: TreeNodeBuider
 * @Description:
 * @Author: duc
 * @Date: 2022/2/27 8:47 PM
 * @Version: V1.0
 **/
public class TreeNodeBuilder {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 9, 20, null, null, 15, 7};
        build(array);
    }

    public static TreeNode build(Integer[] array) {
        TreeNode root;
        TreeNode result = null;
        Queue<TreeNode> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                root = new TreeNode(array[i]);
                result = root;
                queue.add(root);
            }
            if (!queue.isEmpty()) {
                root = queue.poll();
            } else {
                break;
            }
            if (i + 1 < array.length && array[i + 1] != null) {
                root.left = new TreeNode(array[i + 1]);
                queue.add(root.left);
            }
            if (i + 2 < array.length && array[i + 2] != null) {
                root.right = new TreeNode(array[i + 2]);
                queue.add(root.right);
            }
            i = i + 1;
        }
        return result;
    }
}
