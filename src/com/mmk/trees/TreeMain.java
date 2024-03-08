package com.mmk.trees;

import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        bt.populate(sc);
        bt.display();
        bt.prettyDisplay();
    }
}
