package com.dsa.init.linkedlist;

public class CheckPalindromeOnDoublyLL<T> {

    public boolean check(DoublyLinkedList<T> list){
        DoublyLinkedList.Node tailNode = list.tailNode;
        DoublyLinkedList.Node headNode = list.headNode;

        while (tailNode != null && headNode != null){
            if (tailNode.data != headNode.data){
                return false;
            }
            tailNode = tailNode.prevNode;
            headNode = headNode.nextNode;
        }
        return true;
    }
}
