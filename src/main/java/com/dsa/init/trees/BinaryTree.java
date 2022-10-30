package com.dsa.init.trees;

import java.util.List;

public class BinaryTree {

    public BinaryTreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Integer nodeData) {
        this.root = new BinaryTreeNode(nodeData);
    }

    /* BinaryTree(List<Integer> nodeDataList) initializes the data members
   of BinaryTree using the given data slice */
    public BinaryTree(List<Integer> nodeDataList) {
        this.root = null;
        for (Integer nodeData : nodeDataList) {
            insert(nodeData);
        }
    }

    /* findInBSTRec is a helper function used by findInBST to
   	   find the given data in the binary search tree */
    private BinaryTreeNode findInBSTRec(BinaryTreeNode node, int nodeData) {
        if (node == null)
            return null;

        if (node.data == nodeData) {
            return node;
        } else if (node.data > nodeData) {
            return findInBSTRec(node.left, nodeData);
        } else {
            return findInBSTRec(node.right, nodeData);
        }
    }

    /* findInBST is used to find the given data in the binary search tree */
    public BinaryTreeNode findInBST(int nodeData) {
        return findInBSTRec(this.root, nodeData);
    }

    /* populateParentsRec is a helper function that is used by populateParents */
    private void populateParentsRec(BinaryTreeNode node, BinaryTreeNode parent) {
        if (node != null) {
            node.parent = parent;
            populateParentsRec(node.left, node);
            populateParentsRec(node.right, node);
        }
    }

    /* populateParents is used to populate the parent pointers
	   of the nodes in the BinaryTree */
    public void populateParents() {
        populateParentsRec(this.root, null);
    }


    /* getSubTreeNodeCount returns the count of the nodes in
   the sub-tree rooted at the given node */
    public int getSubTreeNodeCount(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + getSubTreeNodeCount(node.left) + getSubTreeNodeCount(node.right);
        }
    }

    // populateCountRec is a helper function used by PopulateCount
    private void populateCountRec(BinaryTreeNode node) {
        if (node != null) {
            node.count = getSubTreeNodeCount(node);
            populateCountRec(node.left);
            populateCountRec(node.right);
        }
    }

    /* populateCount is used to calculate the number of
	   node present in the BinaryTree */
    public void populateCount() {
        populateCountRec(this.root);
    }

    // getTreeDeepCopyRec is a helper function used by getTreeDeepCopy
    private BinaryTreeNode getTreeDeepCopyRec(BinaryTreeNode node) {
        if (node != null) {
            BinaryTreeNode newNode = new BinaryTreeNode(node.data);
            newNode.left = getTreeDeepCopyRec(node.left);
            newNode.right = getTreeDeepCopyRec(node.right);
            return newNode;
        } else {
            return null;
        }
    }

    // getTreeDeepCopy is used to make a deep copy of the BinaryTree
    public BinaryTree getTreeDeepCopy() {
        if (this.root == null) {
            return null;
        } else {
            BinaryTree treeCopy = new BinaryTree();
            treeCopy.root = getTreeDeepCopyRec(root);
            return treeCopy;
        }
    }

    /* findInBTRec is a helper function used by findInBT to
	   find the given data in the binary tree */
    private BinaryTreeNode findInBTRec(BinaryTreeNode node, int nodeData) {
        if (node == null) {
            return null;
        }

        if (node.data == nodeData) {
            return node;
        }

        BinaryTreeNode leftNode = findInBTRec(node.left, nodeData);
        if (leftNode != null) {
            return leftNode;
        }

        BinaryTreeNode rightNode = findInBTRec(node.right, nodeData);
        return rightNode;
    }

    // findInBT is used to find the given data in the binary tree
    public BinaryTreeNode findInBT(int nodeData) {
        return findInBTRec(this.root, nodeData);
    }

    public void insert(int nodeData) {
        // Create a new node (2)
        BinaryTreeNode newNode = new BinaryTreeNode(nodeData);
        if (this.root == null) {
            // Since there is no root node - the new node becomes the root node
            this.root = newNode;
        } else {

            // parent null
            BinaryTreeNode parent = null;

            // preserve root in a temp var
            BinaryTreeNode tempNode = this.root;

            // iterate till you reach the leaf node
            while (tempNode != null) {

                // parent = the current root node
                parent = tempNode;

                // if the value which is in the current parent > parent node
                // set left node as its parent
                // otherwise the right of it becomes its parent
                if (nodeData <= tempNode.data) {
                    tempNode = tempNode.left;
                } else {
                    tempNode = tempNode.right;
                }
            }

            // We have traversed till the last node - where the new node can be set
            if (nodeData <= parent.data) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }
    }
}
