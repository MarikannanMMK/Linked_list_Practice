package com.mmk.linkedlist;

public class MainCLL {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insertLast(8);
        list.insertLast(9);
        list.insertLast(3);
        list.insertLast(1);

        list.display();

        list.delete(3);

        list.display();

    }
}
