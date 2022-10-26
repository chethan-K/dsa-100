package com.dsa.init.linkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveDuplicates {

    public static void removeDuplicates(SinglyLinkedList<String> list){

        // (1,2,3,4,5)
        //
        SinglyLinkedList.Node outerNode = list.headNode;
        SinglyLinkedList.Node innerNode;
        // Traverse through the list till the last
        while (outerNode != null && outerNode.nextNode != null) {
            innerNode = outerNode;
            // Traverse through each from the outer node (1,2,3,4), (2,3,4), (3,4), (4)
            while (innerNode.nextNode != null) {

                // compare the data of outer node with next of inner node
                if(outerNode.data.equals(innerNode.nextNode.data)){
                    // if duplicate found - set the inner node's next to next.next
                    innerNode.nextNode = innerNode.nextNode.nextNode;
                } else {
                    // Move to the next node innerNode to innerNode.next
                    innerNode = innerNode.nextNode;
                }
            }

            // Move to the next node
            outerNode = outerNode.nextNode;
        }
    }
}
