package com.dsa.init.linkedlist;

public class UnionIntersection {

    public static void unionLists(SinglyLinkedList<String> list1, SinglyLinkedList<String> list2){
        SinglyLinkedList.Node headNode = list1.headNode;
        while (headNode.nextNode != null){
            headNode = headNode.nextNode;
        }
        headNode.nextNode = list2.headNode;
        RemoveDuplicates.removeDuplicates(list1);
    }

    public static SinglyLinkedList<String> intersectionLists(SinglyLinkedList<String> list1, SinglyLinkedList<String> list2) {
        SinglyLinkedList<String> result = new SinglyLinkedList<String>();
        SinglyLinkedList<String>.Node current = list1.headNode;
        while (current != null) {
            if (list2.contains((String) current.data)) {
                result.insertAtHead(current.data);
            }
            current = current.nextNode;
        }
        return result;
    }
}
