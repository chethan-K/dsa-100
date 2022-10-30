package com.dsa.init.trees;

public class InorderSuccessorBST {

    public static BinaryTreeNode findInorderSuccessor(BinaryTreeNode root, int nodeValue) {

        // Null check
        if (root == null) {
            return null;
        }

        /**
         *
         *  1. Find the node with the same value as the given value.
         *  If no such node is found, return a node with a value of -1
         *
         *  2. If the node with the given value has right child , then
         *  left most child in the right child's subtree is the in-order successor
         *  Also - this successor is the child with minimum value in that subtree
         *
         *  3. If the node with given value has no right child, then
         *  in-order successor is the node with minimum value - higher than the given value
         *  in the parent chain of the node with the given value
         *
         *  4. If we don't find node in 2, 3 then there is no successor
         *
         */


        // Initializing variable that will store any potential in-order successor
        // node in the parent chain
        BinaryTreeNode successor = null;


        // Traverse till you find the successor
        while (root != null) {

            if(root.data < nodeValue) {
                // node value is more than the root
                // Moving towards right
                root = root.right;

            } else if (root.data > nodeValue) {
                // node value is less than the root node
                // move towards left.
                // set root as successor
                successor = root;
                root = root.left;
            } else {
                // Reached to the point where nodeValue is found

                // successor is the node value which is
                // lowest of right subtree
                if(root.right != null) {
                    successor = treeMin(root.right);
                }
                break;
            }
        }

        return successor;
    }

    // Function to find the minimum value node in sub-tree
    static BinaryTreeNode treeMin(BinaryTreeNode root) {
        // Traversing to the left-most child node
        while (root.left != null) {
            root = root.left;
        }

        // Returns the left-most node of sub-tree
        return root;
    }
}
