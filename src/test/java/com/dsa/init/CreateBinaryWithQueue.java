package com.dsa.init;

import com.dsa.init.stacksQueues.QQueue;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateBinaryWithQueue {

    /**
     * How to create binary numbers
     * 1 10 11 100 101 110 111
     * First enqueue 1
     * Iterate over the given numbers
     * dequeue and put into the string array
     * Create two string
     * 1. appending 0
     * 2. appending 1
     *
     * enqueue(1), enqueue(2)
     *
     * @param number
     * @return
     */
    public static String[] generateBinary(int number){
        String[] result = new String[number];
        QQueue<String> queue = new QQueue<String>(number + 1);

        queue.enqueue("1");

        // Keep generating the binary sequence
        //
        for (int i = 0; i < number; i++) {
            // "1" "10", 11
            result[i] = queue.dequeue();

            // 10 100
            String s1 = result[i] + "0";

            // 11 101
            String s2 = result[i] + "1";

            // 10, 11, 100, 101
            queue.enqueue(s1);
            queue.enqueue(s2);
        }

        return result;
    }
}
