package com.mmk.linkedlist;

public class CustomStack {

    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val) throws StackException {
        if (isFull()) {
            throw new StackException("Cannot insert element stack is full");
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr--];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int peak() {
        return data[ptr];
    }

    public void display() {
        for (int i = ptr; i >= 0; i--) {
            System.out.println(data[i] + " ->");
        }
    }
}
