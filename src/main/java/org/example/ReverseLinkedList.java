package org.example;

import org.example.helpers.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode previous, current, next;
        current = head;
        next = previous = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

}
