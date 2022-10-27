package com.dsa.init;

import com.dsa.init.stacksQueues.CheckBalancedParenthesesWithStack;
import com.dsa.init.stacksQueues.EvaluatePostFixExpression;
import com.dsa.init.stacksQueues.QueueUsingStack;
import com.dsa.init.stacksQueues.SStack;
import com.dsa.init.stacksQueues.SortWithStack;
import com.dsa.init.stacksQueues.StackUsingQueue;
import com.dsa.init.stacksQueues.StackUsingQueue2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Stack;

@SpringBootTest
@Slf4j
public class StacksTest {
    @Test
    void testStack() {
        SStack stack = new SStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        log.info(stack.top() + "");
        log.info(stack.top() + "");
        log.info(stack.top() + "");
        log.info(stack.top() + "");
        stack.push(1000);
        log.info(stack.pop() + "");
        log.info(stack.pop() + "");
        log.info(stack.pop() + "");
    }

    @Test
    void testStackFromQueue1() {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        log.info(stack.pop() + "");
        log.info(stack.pop() + "");
        log.info(stack.pop() + "");
        stack.push(2);
        log.info(stack.pop() + "");
        log.info(stack.pop() + "");
    }

    @Test
    void testStackFromQueue2() {
        StackUsingQueue2 stack = new StackUsingQueue2();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        log.info(stack.pop() + "");
        log.info(stack.pop() + "");
        log.info(stack.pop() + "");
        stack.push(2);
        log.info(stack.pop() + "");
        log.info(stack.pop() + "");
    }

    @Test
    void sortValuesInStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        SortWithStack.sort(stack);

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    @Test
    void testEvaluatePostFixExpression() {
        String str = "921*-8-4+";
        int result = EvaluatePostFixExpression.evaluate(str);
        log.info(result + " <---");
    }

    @Test
    void testCheckBalancedParenthesesWithStack() {
        String str = "[]";
        boolean result = CheckBalancedParenthesesWithStack.isBalanced(str);
        log.info(result + " <---");

        str = "[[[{}{}{}()]]]";
        result = CheckBalancedParenthesesWithStack.isBalanced(str);
        log.info(result + " <---");

        str = "[[[{}{{}{}()]]]";
        result = CheckBalancedParenthesesWithStack.isBalanced(str);
        log.info(result + " <---");

        str = "[";
        result = CheckBalancedParenthesesWithStack.isBalanced(str);
        log.info(result + " <---");
    }

}
