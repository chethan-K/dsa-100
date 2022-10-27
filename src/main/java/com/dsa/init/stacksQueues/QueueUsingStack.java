package com.dsa.init.stacksQueues;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class QueueUsingStack<T> {
    /**
     * Algorithm
     * Methods to implement in queue - enqueue, dequeue
     * enqueue is just putting value on top of stack
     * dequeue is not stack.pop() as we need to return the first element which is put on the stack
     * Start dumping values from stack1 to stack2. The top one is what first added.
     *
     */
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    boolean isEmpty() {
        return stack1.size() + stack2.size() == 0;
    }
    public void enqueue(T data){
        stack1.push(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            log.error("Queue is empty");
        }

        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
