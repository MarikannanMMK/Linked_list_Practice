package com.mmk.trees;

import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        bt.populate(sc);
        bt.display();
        bt.prettyDisplay();

        BST bst = new BST();
        int[] input = {1,2,3,4,5,6,7,8,9,10,11};
        bst.populatedSorted(input);
        bst.display();

    }
}
