package com.dsa.init.stacksQueues;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QQueue<T> {

    // Queue members
    private int front;
    private int back;
    private T[] arr;
    private int maxSize;
    private int currentSize;

    public QQueue(int maxSize){
        front = 0;
        back = -1;
        this.maxSize = maxSize;
        currentSize = 0;
        arr = (T[]) new Object[maxSize];
    }
    public int getSize(){
        return currentSize;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean isFull(){
        return currentSize == maxSize;
    }

    public void enqueue(T data){
        if(isFull()){
            log.error("Queue is full!");
            return;
        }

        back = (back + 1) % maxSize;
        arr[back] = data;
        currentSize++;
    }

    public T dequeue(){
        if(isEmpty()){
            log.error("Queue is empty!");
            return null;
        }

        T temp = arr[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return temp;
    }
}
