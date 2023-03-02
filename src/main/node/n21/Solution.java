package node.n21;

import node.common.ListNode;

import java.util.Stack;

public class Solution {

    /**
     * 合并两个有序链表
     */
    public static void main(String[] args) {
        ListNode f = new ListNode();
        f.setValue(1);
        ListNode f1 = new ListNode();
        f1.setValue(2);
        ListNode f2 = new ListNode();
        f2.setValue(3);
        ListNode f3 = new ListNode();
        f3.setValue(4);

        f2.setNext(f3);
        f1.setNext(f2);
        f.setNext(f1);


        ListNode s = new ListNode();
        s.setValue(1);
        ListNode s1 = new ListNode();
        s1.setValue(3);
        ListNode s2 = new ListNode();
        s2.setValue(6);
        ListNode s3 = new ListNode();
        s3.setValue(6);

        s2.setNext(s3);
        s1.setNext(s2);
        s.setNext(s1);

        merge(f, s);

    }

    public static void merge(ListNode f, ListNode s) {
        ListNode root = new ListNode(-1);
        ListNode head = root;

        while (f != null && s != null) {
            if (f.getValue() > s.getValue()) {
                head.setNext(s);
                s = s.getNext();
            } else {
                head.setNext(f);
                f = f.getNext();
            }
            head = head.getNext();
        }

        if (f != null) {
            head.setNext(f);
        }
        if (s != null) {
            head.setNext(s);
        }

        while (root.getNext() != null) {
            System.out.println(root.getNext().getValue());
            root = root.getNext();
        }
    }


}
