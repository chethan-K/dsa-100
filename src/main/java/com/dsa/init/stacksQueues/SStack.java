package com.dsa.init.stacksQueues;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SStack<T> {
    private int top;
    private int maxSize;
    private T[] arr;

    public SStack(int maxSize){
        this.maxSize = maxSize;
        top = -1;
        arr = (T[]) new Object[maxSize];
    }

    public int getMaxSize(){
        return maxSize;
    }

    public boolean isFull(){
        return top == maxSize -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(T data){
        if(isFull()){
            log.error("Stack is already full");
            return;
        }
        arr[++top] = data;
    }

    public T pop(){
        if(isEmpty()){
            log.error("Stack is empty");
            return null;
        }
        return arr[top--];
    }

    public T top(){
        if(isEmpty()){
            log.error("Stack is empty");
            return null;
        }
        return arr[top];
    }
}
