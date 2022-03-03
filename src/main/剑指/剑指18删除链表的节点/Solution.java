package 剑指.剑指18删除链表的节点;

import 剑指.common.ListNode;

/**
 * @ClassName: Solution
 * @Description: 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。 返回删除后的链表的头节点。
 * @Author: duc
 * @Date: 2022/3/3 4:19 PM
 * @Version: V1.0
 **/
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }

        ListNode pre = head;
        ListNode next = head.next;
        while (next != null) {
            if (next.val == val) {
                pre.next = next.next;
                break;
            } else {
                pre = next;
                next = next.next;
            }
        }
        return head;
    }
}
