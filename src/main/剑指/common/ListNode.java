package 剑指.common;

/**
 * @ClassName: ListNode
 * @Description:
 * @Author: duc
 * @Date: 2022/3/2 11:36 PM
 * @Version: V1.0
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode init(int[] array) {
        ListNode root = new ListNode(-1);
        ListNode head = new ListNode(array[0]);
        root.next = head;
        for (int i = 1; i < array.length; i++) {
            head.next = new ListNode(array[i]);
            head = head.next;
        }
        return root.next;
    }
}
