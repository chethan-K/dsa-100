package com.dsa.init.stacksQueues;

import java.util.Stack;

public class SortWithStack {

    public static void sort(Stack<Integer> mainStack){


        // If the value is smaller pop all values from temp stack onto main stack
        // push the value to tempStack. Then re-dump values from main stack
        // Repeat this process till the Values in mainStack is cleared
        // Then re-dump values from tempStack onto mainStack

        Stack<Integer> tempStack = new Stack<>();

        while (!mainStack.isEmpty()){

            // pop value from main stack
            Integer value = mainStack.pop();

            // compare value with top value from tempStack
            if (!tempStack.isEmpty() && value >= tempStack.peek()) {

                // if greater push this on to top of tempStack
                tempStack.push(value);
            } else {

                // If the value is smaller, pop all the values from temp stack till it finds smaller value in temp stack
                while (!tempStack.isEmpty() && tempStack.peek() > value) {

                    // Then push the value on top of temp stack
                    mainStack.push(tempStack.pop());
                }
                tempStack.push(value);
            }
        }

        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }
    }
}
