package HOT100.Q2两数相加.function1;

import HOT100.common.ListNode;

/**
 * @ClassName: Solution
 * @Description: 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * @Author: duc
 * @Date: 2022/2/28 10:14 PM
 * @Version: V1.0
 **/
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode q1 = l1;
        ListNode q2 = l2;

        ListNode res = new ListNode(-1);
        int p = 0;
        while (q1 != null || q2 != null) {
            // 获取当前节点的value，当某个listNode被遍历完时，后面的值使用0填充
            int l1val = q1 == null ? 0 : q1.val;
            int l2val = q2 == null ? 0 : q2.val;
            // 当前位的值 = l1val + l2val + 进位暂存值
            int x = l1val + l2val + p;
            int value;
            if (x > 10) {
                p = 1;
                value = x % 10;
            } else {
                value = x;
            }
            ListNode next = new ListNode(value);



        }


        return null;
    }
}
