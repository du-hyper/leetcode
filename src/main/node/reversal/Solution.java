package node.reversal;

import node.common.ListNode;

import java.util.Stack;

public class Solution {

    /**
     * 反转链表
     */
    public static void main(String[] args) {
        ListNode root = new ListNode();
        root.setValue(1);
        ListNode root1 = new ListNode();
        root1.setValue(2);
        ListNode root2 = new ListNode();
        root2.setValue(3);
        ListNode root3 = new ListNode();
        root3.setValue(4);

        root2.setNext(root3);
        root1.setNext(root2);
        root.setNext(root1);


        stack(root);
        reversal(root);
    }

    /**
     * 栈
     */
    public static void stack(ListNode n) {
        Stack<ListNode> stack = new Stack<>();
        while (n != null) {
            stack.push(n);
            n = n.getNext();
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().getValue());
        }
    }

    public static void reversal(ListNode n) {
        ListNode root = n;
        ListNode v = null;
        while (root != null) {
            ListNode temp = root.getNext();
            root.setNext(v);
            v = root;
            root = temp;
        }
        while (v != null) {
            System.out.println(v.getValue());
            v = v.getNext();
        }
    }

}
