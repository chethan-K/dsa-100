package com.dsa.init.trees;

public class IdenticalTrees {
    /**
     *
     * We do a depth-first traversal on both trees simultaneously and compare the node data at each level.
     * The base case of this recursion is to check if:
     *   - Both nodes that we compare are NULL - return true
     *   - Only one of the nodes that we compare is NULL. If yes, we return FALSE
     *
     * Two trees A and B are identical if
     *   - The data value in their root nodes is the same or NULL.
     *   - The left subtree of tree A is identical to the left subtree of tree B.
     *   - The right subtree of tree A is identical to the right subtree of tree B.
     *
     */
    public static boolean areIdentical(BinaryTreeNode tree1Node, BinaryTreeNode tree2Node) {

        if (tree1Node == null && tree2Node == null) {
            return true;
        }

        if (tree1Node != null && tree2Node != null) {
            return (areIdentical(tree1Node.left, tree2Node.left) && areIdentical(tree1Node.right, tree2Node.right) && (tree1Node.data == tree2Node.data));
        }
        return false;
    }
}
