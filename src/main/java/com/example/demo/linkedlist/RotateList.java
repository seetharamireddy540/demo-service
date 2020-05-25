package com.example.demo.linkedlist;

import java.util.List;

public class RotateList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        RotateList rotateList = new RotateList();
        rotateList.printList(head);
        // rotateList.roateList(head);
    }

    private void printList(ListNode head) {
        if (head == null) {
            System.out.println("Null");
        }
        ListNode current = head;
        int length = 0;
        while (current != null) {
            System.out.print(current.value + " => ");
            current = current.next;
            length++;
        }
        System.out.println("Size of LinkedList = " + length);
    }

    public void rotateList(ListNode head) {

    }
}
