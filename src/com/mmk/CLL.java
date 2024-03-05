package com.mmk;

public class CLL {

    private Node head;
    private Node tail;


    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }


    public void display() {
        Node temp = head;

        do {
            System.out.print(temp.val + " ->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("END");
    }

    public void delete(int val) {

        Node temp = head;

        do {
            Node n = temp.next;
            if (n.val == val) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);

    }

    private class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
