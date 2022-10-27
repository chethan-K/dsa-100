package com.dsa.init;

import com.dsa.init.stacksQueues.QQueue;
import com.dsa.init.stacksQueues.QueueUsingStack;
import com.dsa.init.stacksQueues.QueueUsingStack2;
import com.dsa.init.stacksQueues.ReverseFirstKElementsQueue;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

@SpringBootTest
@Slf4j
public class QueuesTest {
    @Test
    void testQueue() {
        QQueue q = new QQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        log.info(q.dequeue() + "");
        log.info(q.dequeue() + "");
        log.info(q.dequeue() + "");
        log.info(q.dequeue() + "");
        q.enqueue(6);
        q.enqueue(7);
        log.info(q.dequeue() + "");
    }

    @Test
    void testQueueFromStack() {
        QueueUsingStack<Integer> q = new QueueUsingStack<>();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        log.info(q.dequeue() + "");
        log.info(q.dequeue() + "");
        log.info(q.dequeue() + "");
        log.info(q.dequeue() + "");
        q.enqueue(6);
        q.enqueue(7);
        log.info(q.dequeue() + "");
    }

    @Test
    void testQueueFromStack2() {
        QueueUsingStack2<Integer> q = new QueueUsingStack2<>();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        log.info(q.dequeue() + "");
        log.info(q.dequeue() + "");
        log.info(q.dequeue() + "");
        log.info(q.dequeue() + "");
        q.enqueue(6);
        q.enqueue(7);
        log.info(q.dequeue() + "");
    }

    @Test
    void testCreateBinaryWithQueue() {
        String[] result = CreateBinaryWithQueue.generateBinary(10);
        Arrays.stream(result).forEach((r)-> System.out.print(r + " "));
    }


    @Test
    void testReverseFirstKElementsQueue() {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue result = ReverseFirstKElementsQueue.reverse(q, 2);
        while (!result.isEmpty()){
            System.out.print(result.remove() + " ");
        }
    }

}
