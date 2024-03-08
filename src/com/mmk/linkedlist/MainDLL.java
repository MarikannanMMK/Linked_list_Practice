package com.mmk.linkedlist;

public class MainDLL {

    public static void main(String[] args) {

        DLL list = new DLL();

        list.insertFirst(19);
        list.insertFirst(8);
        list.insertFirst(3);
        list.insertFirst(1);

        list.display();

        list.insertLast(27);

        list.display();

        list.insertAfterValue(8, 74);

        list.display();
    }
}
