package com.dsa.init.linkedlist;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @param <T>
 */

@Slf4j
public class SinglyLinkedList<T>{

    // value of headNode
    public Node headNode;
    public int size;

    public class Node {
        // Data which is supposed to be stored in the node
        public T data;

        // Reference to the next node
        public Node nextNode;
    }

    public void insertAtHead(T data) {
        // Create new instance of node and set the data
        Node node = new Node();
        node.data = data;

        // Since we are trying to inset node to head
        // refer the nextNode to current headNode
        // this node becomes the headNode
        node.nextNode = headNode;
        headNode = node;
        size++;
    }

    public void insertAtEnd(T data) {

        // If empty insert at head
        if(isEmpty()){
            insertAtHead(data);
            return;
        }


        // Create new instance of node and set the data
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node last = headNode;
        // Traverse through the list till the last node
        while (last.nextNode != null){
            last = last.nextNode;
        }

        // Set this new node to nextNode of lastNode
        last.nextNode = newNode;
        size++;
    }

    public boolean isEmpty(){
        if(headNode == null) return true;
        return false;
    }

    /**
     * Find the data in linked list
     *
     */
    public boolean contains(T data){
        while (headNode != null) {
            if(data.equals(headNode.data)){
                return true;
            } else {
                headNode = headNode.nextNode;
            }
        }
        return false;
    }

    public void deleteByValue(T data){
        if(isEmpty()) return;

        Node currentNode = this.headNode;
        Node prevNode = null; // Value of the prev node is null initially

        // If the value is found in the head node itself
        // clean up the node using deleteAtHead
        // deleteAtHead();

        while (currentNode != null) {
            // found the nodeTo be deleted
            if(data.equals(currentNode.data)){
                // PrevNode's nextNode is actually current node
                // Since we are deleting the current node by removing the references -
                // setting current Node's next as previous node's next
                prevNode.nextNode = currentNode.nextNode;
                return;
            }

            // Setting previous node to current node and current node is set to next node for iteration.8
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }
    }

    //Deletes data from the head of list
    public void deleteAtHead() {
        //if list is empty then simply return
        if (isEmpty())
            return;
        //make the nextNode of the headNode equal to new headNode
        headNode = headNode.nextNode;
        size--;
    }

    // insert node after the given previous node
    public void insertAfter(T data, T previous) {
        Node newNode = new Node();
        newNode.data = data;

        Node currentNode = this.headNode;

        //traverse the list until node having data equal to previous is found
        while (currentNode != null && currentNode.data != previous) {
            currentNode = currentNode.nextNode;
        }

        if(currentNode != null){
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
        }
    }

    public int length(){
        int count = 0;
        Node temp = headNode;
        while (temp != null){
            temp = temp.nextNode;
            count ++;
        }
        return count;
    }
}
