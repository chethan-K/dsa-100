package com.dsa.init.stacksQueues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsQueue {

    // 1,2,3,4,5

    // 2,1,4,3,5
        public static Queue reverse(Queue q, int k){

           // 1 2 3 4 5
           Stack stack = new Stack();
           while (!q.isEmpty()) {
                stack.push(q.remove());
           }

           // 5 4 3 2 1
           while (!stack.isEmpty()){
               q.add(stack.pop());
           }

             // 5,4,3,2,1
             //   4,3,2,1,5
             //     3 2 1 5 4
             //       2 1 5 4 3
             //
            /**
             *  IMP - q.add = r.remove
             */
           for(int i =0; i < q.size() - k; i++){
               q.add(q.remove());
           }
            return q;
        }

}
