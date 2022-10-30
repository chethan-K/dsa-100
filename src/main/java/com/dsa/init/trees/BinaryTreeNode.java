package com.dsa.init.trees;

public class BinaryTreeNode {

    // data
    public int data;

    // left
    public BinaryTreeNode left;

    // right
    public BinaryTreeNode right;

    // next
    public BinaryTreeNode next;

    // parent
    public BinaryTreeNode parent;

    // count
    public int count;

    public BinaryTreeNode(int d) {
        data = d;
        left = null;
        right = null;
        next = null;
        parent = null;
        count = 0;
    }
}
