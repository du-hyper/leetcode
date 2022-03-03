package 剑指.剑指24反转链表;

import HOT100.common.ListNode;

/**
 * @ClassName: Solution
 * @Description: 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * @Author: duc
 * @Date: 2022/3/2 11:16 PM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

