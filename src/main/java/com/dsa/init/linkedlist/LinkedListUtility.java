package com.dsa.init.linkedlist;

public class LinkedListUtility<T> {

   public void reverseList(SinglyLinkedList<T> list) {

       SinglyLinkedList.Node prev = null;
       SinglyLinkedList.Node currentNode = list.headNode;
       SinglyLinkedList.Node next = null;

        // (null, null) - prev
        // 3 (3, 4)     - current
        // 4 (4, 5)     - current.next (next)
        // 5 (5, null)

        // 5 (5, 4)
        // 4 (4, 3)
        // 3 (3, null)
       while (currentNode != null){
           next = currentNode.nextNode;
           currentNode.nextNode = prev;
           prev = currentNode;
           currentNode = next;
       }
       list.headNode = prev;
   }

    public void reverseDoubleList(DoublyLinkedList<T> list) {
        DoublyLinkedList.Node temp = null;
        DoublyLinkedList.Node current = list.headNode;
        while (current != null){
            temp = current.prevNode;
            current.prevNode = current.nextNode;
            current.nextNode = temp;
            current = current.prevNode;
        }
        list.headNode = temp.prevNode;
    }
}
