package com.dsa.init.linkedlist;

public class DoublyLinkedList<T> {

    //member variables
    public Node headNode;
    public Node tailNode;
    public int size;

    //Node inner class for DLL
    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;
    }

    //constructor
    public DoublyLinkedList() {
        this.headNode = null;
        this.tailNode = null; //null initially
        this.size = 0;
    }

    //returns true if list is empty
    public boolean isEmpty() {
        if (headNode == null && tailNode == null) //checking tailNode to make sure
            return true;
        return false;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        newNode.prevNode = null;
        if(!isEmpty()){
            headNode.prevNode = newNode;
        } else {
            tailNode = newNode;
        }
        this.headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {

        if (isEmpty()) { //if list is empty then insert at head
            insertAtHead(data);
            return;
        }

        // Make new node
        Node newNode = new Node();
        newNode.data = data;
        newNode.prevNode = tailNode;
        newNode.nextNode = null;

        // Set nextNode of the last node to newNode
        // new node becomes the tail node
        tailNode.nextNode = newNode;
        this.tailNode = newNode;
        size ++;
    }

    public void deleteAtHead(){
        if (isEmpty())
            return;
        headNode = headNode.nextNode;
        if(headNode == null)
            tailNode = null;
        else
            headNode.prevNode = null;
        size--;
    }

    public void deleteAtEnd(){
        if (isEmpty())
            return;
        tailNode = tailNode.prevNode;
        if(tailNode == null)
            headNode = null;
        else
            tailNode.nextNode = null;
        size--;
    }
}
