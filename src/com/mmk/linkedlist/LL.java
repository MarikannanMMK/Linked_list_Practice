package com.mmk.linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insert_first(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size of the linked list = " + size);

    }

    public void insert_Last(int val) {


        if (tail == null) {
            insert_first(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;


    }

    public void insertPosition(int position, int val) {

        if (size == 0) {
            insert_first(val);
            return;
        }
        if (size == position) {
            insert_Last(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        Node newnode = new Node(val, temp.next);
        temp.next = newnode;
        size += 1;

    }

    public int deleteFirst() {

        int value = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;


    }

    public int deleteLast() {

        int val = tail.val;
        Node node = get(size - 2);
        node.next = null;
        tail = node;
        size--;
        return val;

    }


    public Node get(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int delete(int index) {

        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return val;

    }


    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

}
