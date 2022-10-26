package com.dsa.init.linkedlist;

public class DetectLoop {
    public static boolean detect(SinglyLinkedList<String> list){
        SinglyLinkedList.Node slow = list.headNode;
        SinglyLinkedList.Node fast = list.headNode;
        while (slow != null && fast != null && fast.nextNode != null){
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
            if(slow == fast){
               return true;
            }
        }
        return false;
    }
}
