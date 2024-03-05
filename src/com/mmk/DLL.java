package com.mmk;

public class DLL {


    private Node head;

    public void insertFirst(int val) {

        Node node = new Node(val);

        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;

    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " ->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("In Reverse Order");

        while (last != null) {
            System.out.print(last.val + " ->");
            last = last.prev;
        }
        System.out.println("START");
    }


    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        if (head == null) {
            insertFirst(val);
            return;
        }
        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;

    }

    public void insertAfterValue(int nodeVal , int val){
        Node node = new Node(val);
        Node temp = head;
        while(temp!=null){
            if(temp.val == nodeVal){
                node.prev = temp;
                node.next = temp.next;
                temp.next = node;
                if(node.next != null){
                    node.next.prev = node;
                }
            }
            temp = temp.next;
        }

    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
