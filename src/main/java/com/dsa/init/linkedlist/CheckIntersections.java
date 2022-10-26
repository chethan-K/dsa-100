package com.dsa.init.linkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckIntersections {

    /**
     *
     * Algorithm
     * Find the difference
     * Move head pointer of longer list 'd' steps forward
     * Now traverse both lists, comparing nodes until we find a match or reach the end
     *
     */
    public LinkedListNode check(LLinkedList list1, LLinkedList list2){
        log.info(" list1 {}",list1.size());
        list1.displayLinkedList();

        log.info(" list2 {}",list2.size());
        list2.displayLinkedList();

        int countDiff = list1.size() - list2.size();
        LinkedListNode headNode1 = list1.head;
        LinkedListNode headNode2 = list2.head;
        // Moving big list pointer by diff steps
        log.info(countDiff + "");
        while (countDiff > 0){
            log.info(countDiff + "");
            headNode1 = headNode1.next;
            countDiff--;
        }
        log.info("headnode1={}", headNode1.data);

        while (headNode1 != null && headNode2 != null){
            if(headNode1 == headNode2) {
                return headNode1;
            }
            headNode1 = headNode1.next;
            headNode2 = headNode2.next;
        }
        return null;
    }
}
