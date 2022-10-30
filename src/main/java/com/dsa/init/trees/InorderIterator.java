package com.dsa.init.trees;

import java.util.Stack;

public class InorderIterator {

    /**
     *
     *  - On creating the instance of In-order-iterator - given the root node
     *  - Create the stack of left nodes from head (root-> root.left1 -> root.left1.left1)
     *  - Implement isEmpty() - check the stack size
     *  - on getNext() -> pop the node from stack (current head node)
     *  - Then go through all the right-nodes of that node! and put on top of stack
     *  - root.left1.left1 -> root.left1.left1.right1 -> root.left1.left1.right1.right1
     *
     */

    // Initializing the stack
    Stack<BinaryTreeNode> stk = new Stack<BinaryTreeNode>();

    // When our iterator is initialized, we populate our stack with all nodes from
    // the root till the left-most node
    public InorderIterator(BinaryTreeNode root) {
        populateStack(root);
    }

    // Function to populate the stack from the root till the left-most node
    public void populateStack(BinaryTreeNode root) {
        while (root != null) {
            // We keep pushing node into the stack until we reach the left-most node
            stk.push(root);
            root = root.left;
        }
    }

    // This function checks if there is a node next in line inside the iterator
    public boolean hasNext() {
        // If the stack is empty, it means that there is no node next in line
        return !stk.isEmpty();
    }

    public BinaryTreeNode getNext() {
        // Return null if there's no succeeding node to return
        if (stk.isEmpty())
            return null;

        BinaryTreeNode rVal = stk.pop();

        BinaryTreeNode temp = rVal.right;
        populateStack(temp);

        // Returning the next node
        return rVal;
    }
}
