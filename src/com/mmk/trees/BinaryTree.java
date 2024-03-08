package com.mmk.trees;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
    }

    //Insert an element into the tree.
    public void populate(Scanner sc) {

        System.out.println("Enter an element into the root : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to insert into the left of : " + node.val);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of : " + node.val);
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }
        System.out.println("Do you want to insert into the right of : " + node.val);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of : " + node.val);
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }

    }

    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String s) {
        if (node == null) {
            return;
        }
        System.out.println(s + node.val);
        display(node.left, s + "\t");
        display(node.right, s + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {

        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    private static class Node {

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }


}
