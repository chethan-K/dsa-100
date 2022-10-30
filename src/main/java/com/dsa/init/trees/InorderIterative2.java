package com.dsa.init.trees;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class InorderIterative2 {

    /**
     *  - In-order traversal of a binary tree starts from the root
     *  - BST prints nodes in sorted ascending order
     *
     *  - First visit the left node "L", followed by current node "N"
     *  - And then the right node "R"
     *
     *  - Initialise the stack - point root node as currentNode
     *  - Push current node onto stack and then point the current node to left node
     *  - Go down till the current node is null
     *
     *  - Now check if currentNode == null (we reached to end - stack top is the leaf node) and stack not empty
     *  - pop the top stack element (which is a left end leaf) and make right node as current node
     *
     *  - when the current node is null and stack is empty - algorithm is terminated
     */

    public static void iterativeInorder(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stk = new Stack<BinaryTreeNode>();

        // point root node as current node
        BinaryTreeNode currNode = root;

        while (currNode != null || !stk.isEmpty()){
            if(currNode != null) {
                stk.push(currNode);
                currNode = currNode.left;
                continue;
            }

            log.info(stk.peek().data + " ");

            // Since current node is null -> get the node from stack top and assign right node as current node
            currNode = stk.pop().right;
        }
    }

}
