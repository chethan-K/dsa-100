package com.dsa.init.linkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReverseLinkedList {

    public static void reverse(LLinkedList list){
        LinkedListNode headNode = list.head;
        LinkedListNode prev = null;
        while (headNode != null) {

            // headNode -> (1,2),(2,3),(3,4),(4,null)
            // (1, null), (2, 1), (3, 2), (4, 3) <- headNode
            // set pointer

            // save the next node in temp - where LL should traverse in forward direction
            LinkedListNode temp = headNode.next;

            // the current Node's next node.next should point to the previous node
            headNode.next = prev;

            // New previous node is set to the current head node
            prev = headNode;

            // moving forward - head node is the next node
            headNode = temp;
        }
        list.head = prev;
    }
}
