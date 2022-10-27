package com.dsa.init.stacksQueues;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class QueueUsingStack2<T> {
    /**
     * Algorithm
     *
     */
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    boolean isEmpty() {
        return stack1.size() + stack2.size() == 0;
    }
    public void enqueue(T data){
        // stack1 = empty
        // Dump - stack1 entries into stack2
        // stack2 - empty
        // stack1 = 1 (push to stack1)
        // Dump - stack2 entries into stack1
        // stack1 = 1

        // stack1 = 1
        // Dump - stack1 entries into stack2
        // stack2 - 1
        // stack1 = 2 (push to stack1)
        // Dump - stack2 entries into stack1
        // stack1 = 2,1

        // stack1 = (2,1)
        // Dump - stack1 entries into stack2
        // stack2 - (1,2)
        // stack1 = 3 (push to stack1)
        // Dump - stack2 entries into stack1
        // stack1 = (3,2,1)

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public T dequeue() {
        return stack1.pop();
    }
}
