package com.mmk;

public class Main {

    public static void main(String[] args) {

        LL linkedList = new LL();

        System.out.println("welcome to Linked list");

        linkedList.insert_first(100);
        linkedList.insert_first(15);
        linkedList.insert_first(28);
        linkedList.insert_first(93);
        linkedList.insert_first(97);

        linkedList.insert_Last(27);

        linkedList.insertPosition(2,88);

        linkedList.display();


    }
}
