package com.dsa.init.linkedlist;

public class FindMiddleNode {
    public static SinglyLinkedList.Node find(SinglyLinkedList<String> list){
        SinglyLinkedList.Node slow = list.headNode;
        SinglyLinkedList.Node fast = list.headNode;
        while (slow != null && fast != null && fast.nextNode != null){
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
            if(fast == null){
               break;
            }
        }
        return slow;
    }
}
