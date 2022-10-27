package com.dsa.init.stacksQueues;

import java.util.Stack;

public class CelebrityWithStack {

    /**
     * Party matrix
     * r/c 0 1 2
     *  0  0 0 0
     *  1  1 0 1
     *  2  1 0 0
     *
     *  [r][c] --> 1 means row knows column
     *
     *  1 knows 0
     *  1 knows 2
     *  2 knows 0
     *
     * As per the definition -
     * person who knows none but many people knows the person is celebrity
     *
     * 1 knows 0 and 2 knows 0 - So the celebrity is 0
     *     0 1 2 3
     *  0 {0,1,1,0}
     *  1 {1,0,1,1}
     *  2 {0,0,0,0}
     *  3 {0,1,1,0}
     *
     *  0,1,3 knows 2 ==> 2 is celebrity
     *
     *     0 1 2 3
     *  0 {0,1,1,0}
     *  1 {1,0,1,1}
     *  2 {0,0,0,1}
     *  3 {0,1,1,0}
     *
     *  0,1,3 knows 2 but 2 knows 3 ==> no celebrity -1
     *
     *     0 1 2 3
     *  0 {0,0,0,0}
     *  1 {1,0,0,1}
     *  2 {1,0,0,1}
     *  3 {1,1,1,0}
     *
     *  1,2,3 knows 0
     *  3 knows 1
     *  3 knows 2
     *  2,1 knows 3
     *
     *  0 is celebrity
     */

    private static boolean aqStatus(int[][] party, int x, int y) {
        if (party[x][y] == 1) return true;
        return false;
    }

    public static int findCelebrity(int[][] party, int numPeople){

        Stack<Integer> stack =  new Stack();

        int celebrity = -1;

        //Push all people in stack
        for (int i = 0; i < numPeople; i++) {
            stack.push(i);
        }

        // Iterate over all the people
        while (!stack.isEmpty()) {

            int x = stack.pop();

            if(stack.isEmpty()){
                celebrity = x;
                break;
            }

            int y = stack.pop();

            // At the end - We get someone - who doesn't know anyone
            if(aqStatus(party, x,y)) {

                // x2 knows x1 -> x1 may be celebrity
                stack.push(y);
            } else {
                // x2 doesn't knows x1 -> x2 may be celebrity
                stack.push(x);
            }
        }

        // the last remaining is the celebrity
        for (int j = 0; j < numPeople; j++) {

            // Celebrity knows no one while everyone knows Celebrity
            // If Celebrity knowing anybody -> aqStatus(celebrity, index)
            // or
            // If anybody doesn't know celebrity -> !aqStatus(index, celebrity)
            // then celebrity is not a celebrity
            if (celebrity != j && (aqStatus(party, celebrity, j) || !(aqStatus(party, j, celebrity)))) return -1;
        }
        return celebrity;
    }

}
