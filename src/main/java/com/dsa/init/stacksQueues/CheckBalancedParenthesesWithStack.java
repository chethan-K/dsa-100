package com.dsa.init.stacksQueues;

import java.util.Stack;

public class CheckBalancedParenthesesWithStack {
    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack();
        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);
            if(character == '}' || character == ']' || character == ')'){
                if(stack.isEmpty()){
                    return false;
                }

                // Since it is one of the closing the parentheses
                // pop the element from top of the stack - which should be of the same type
                // If there is a mismatch - expression is imbalanced
                if (character == '}' && stack.pop() != '{'){
                    return false;
                }
                if (character == ']' && stack.pop() != '['){
                    return false;
                }
                if (character == ')' && stack.pop() != '('){
                    return false;
                }
            } else {
                // Put the opening parentheses on stack
                stack.push(character);
            }
        }
        // At the stack should be empty.
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
