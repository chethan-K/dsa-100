package com.dsa.init.linkedlist;

public class ReverseAlternativeKNodes {
    public static void reverseKNodes(LLinkedList list, int k){
        /**
         * Algorithm
         *  Pointers - reversed, currentHead, currentTail, previousTail
         *
         *  First point is reverse the sublist
         *  first sublist reversed head node is the headNode of overall reversed list
         *  previous sublists tailNode's(after reversed) nextnode will point to the headNode of the current sublist
         *
         */
        LinkedListNode head = list.head;
        LinkedListNode reversed = null;
        LinkedListNode currentTail = null;
        LinkedListNode prevTail = null;

        while(head != null){
            int n = k;
            LinkedListNode headNodeOfReversedSubList = null;

            currentTail = head;
            while (n > 0){
                // put the current node in temp
                LinkedListNode temp = head.next;
                head.next = headNodeOfReversedSubList;
                headNodeOfReversedSubList = head;
                head = temp;
                n--;
            }

            if(reversed == null){
                // First reversed sub list's node is the headNode
                reversed = headNodeOfReversedSubList;
            }

            /**
             * What are we trying to do here
             * current tail is preserved the beginning
             *
             *  On the first iteration headNodeOfReversedSublist is made as a headNode
             *  and
             *  tailNodeOfReversedSublist is preserved in prevTail
             *
             *  On further iterations
             *  PreviousTail's next should point to the headNodeOfReversedSublist
             *  and current sublist's tail become previous sublist's tail
             */
            if(prevTail != null){
                prevTail.next = headNodeOfReversedSubList;
            }
            prevTail = currentTail;
        }

        list.head = reversed;
    }
}
