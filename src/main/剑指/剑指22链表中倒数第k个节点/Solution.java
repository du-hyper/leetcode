package 剑指.剑指22链表中倒数第k个节点;

import 剑指.common.ListNode;

/**
 * @ClassName: Solution
 * @Description: 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 * @Author: duc
 * @Date: 2022/3/3 4:51 PM
 * @Version: V1.0
 **/
public class Solution {
    // 1 2 3 4 5    ------    2
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head;
        ListNode next = head;
        int count = 0;
        while (next != null) {
            next = next.next;
            if (count == k) {
                pre = pre.next;
            } else {
                count++;
            }
        }
        return pre;
    }
}
