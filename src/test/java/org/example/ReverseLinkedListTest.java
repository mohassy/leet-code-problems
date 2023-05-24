package org.example;

import org.example.helpers.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    private ListNode head;
    private ReverseLinkedList reverseLinkedList;
    @BeforeEach
    void setUp() {
        ListNode five = new ListNode(5, null);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        head = new ListNode(1, two);
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    void testReverseList() {
        ListNode newHead = reverseLinkedList.reverseList(head);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        int i = 0;
        while(newHead.next != null){
            assertEquals(expected[i++], newHead.val);
            newHead = newHead.next;
        }
    }
}