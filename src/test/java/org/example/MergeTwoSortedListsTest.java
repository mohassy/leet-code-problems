package org.example;

import org.example.helpers.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeTwoSortedLists;
    private ListNode list1, list2;
    @BeforeEach
    void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode prev, current;
        int[] array1 = new int[]{1,2,4};
        prev = current = null;
        for(int i : array1){
            current = new ListNode(i, prev);
            prev = current;
        }
        list1 = new ReverseLinkedList().reverseList(current);
        int[] array2 = new int[]{1,3,4};
        prev = null;
        for(int i : array2){
            current = new ListNode(i, prev);
            prev = current;
        }
        list2 = new ReverseLinkedList().reverseList(current);

    }

    @Test
    void mergeTwoLists() {
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);
    }
}