package com.dsa.init.stacksQueues;

public class TwoStacksWithArray<T> {
    private int top1;
    private int top2;
    private int maxSize;
    private T[] arr;

    public TwoStacksWithArray(int size) {
        maxSize = size;
        top1 = -1;
        top2 = size;
        arr = (T[]) new Object[size];
    }

    public void push1(T data) {
        arr[top1++] = data;
    }

    public T pop1() {
        return arr[--top1];
    }

    public void push2(T data) {
        arr[--top2] = data;
    }

    public T pop2() {
        return arr[--top1];
    }
}
