package 剑指.剑指06从尾到头打印链表;

import 剑指.common.ListNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @ClassName: Solution
 * @Description:
 * @Author: duc
 * @Date: 2022/3/2 11:37 PM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 4, 6};
        ListNode param = ListNode.init(array);

        Solution solution = new Solution();
        int[] res = solution.reversePrint1(param);
        int[] res1 = solution.reversePrint2(param);

        Arrays.stream(res).forEach(e -> System.out.print(e));
        System.out.println();
        Arrays.stream(res1).forEach(e -> System.out.print(e));
    }

    public int[] reversePrint1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop().intValue();
        }
        return res;
    }

    public int[] reversePrint2(ListNode head) {
        LinkedList<Integer> res = new LinkedList<>();
        while (head != null) {
            res.addLast(head.val);
            head = head.next;
        }
        int[] ress = new int[res.size()];
        for (int i = 0; i < ress.length; i++) {
            ress[i] = res.removeLast();
        }
        return ress;
    }
}
