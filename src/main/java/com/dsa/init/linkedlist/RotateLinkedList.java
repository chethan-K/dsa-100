package com.dsa.init.linkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RotateLinkedList {

    public static void rotate(LLinkedList list, int rotateBy){

        int listSize = list.size();

        // Get modulo to handle rotateBy count grater than lenght
        rotateBy = rotateBy % listSize;

        // if negative add rotate with negative number to give the right effect
        if(rotateBy < 0){
            rotateBy = rotateBy + listSize;
        }

        if(rotateBy == 0){
            return;
        }

        // Got to the node from where rotation is required
        int index = 1;
        LinkedListNode last = list.head;
        while (index < rotateBy){
            last = last.next;
            index++;
        }

        // goto last node
        LinkedListNode oldLast = last;
        while (oldLast.next != null){
            oldLast = oldLast.next;
        }

        // Current List's last.next is the headNode
        oldLast.next = list.head;

        // New list's head should point to the new head
        list.head = last.next;

        // Setting last node's next to null
        last.next = null;
    }
}
