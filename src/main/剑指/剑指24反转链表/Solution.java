package 剑指.剑指24反转链表;

import HOT100.common.ListNode;

/**
 * @ClassName: Solution
 * @Description:
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

