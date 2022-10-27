package com.dsa.init.stacksQueues;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Queue;

@Slf4j
public class StackUsingQueue2<T> {
    /**
     * Algorithm
     * Methods to implement in queue - enqueue, dequeue
     * enqueue is just putting value on top of stack
     * dequeue is not stack.pop() as we need to return the first element which is put on the stack
     * Start dumping values from stack1 to stack2. The top one is what first added.
     *
     */
    Queue<T> q1 = new ArrayDeque<>();
    Queue<T> q2 = new ArrayDeque<>();

    boolean isEmpty() {
        return q1.size() + q2.size() == 0;
    }

    public T pop(){
        if(q1.isEmpty()){
            log.error("Stack is empty!");
        }
        while (q1.size() > 1){
            q2.add(q1.remove());
        }
        T ele = q1.remove();
        swapQueues();
        return ele;
    }

    public void push(T data){
        q1.add(data);
    }

    private void swapQueues(){
        Queue<T> q3 = q2;
        q2 = q1;
        q1 = q3;
    }
}
