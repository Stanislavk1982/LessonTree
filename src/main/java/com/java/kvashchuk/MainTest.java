package com.java.kvashchuk;

public class MainTest {
    public static void main(String[] args) {
        CustomBinaryTree tree = new CustomBinaryTree();
        tree.addNode(11, "Dog");
        tree.addNode(15, "Turtle");
        tree.addNode(1, "Teenage Mutant Ninja Turtles");
        tree.addNode(2, "Leonardo");
        tree.addNode(3, "Raphael");
        tree.addNode(6, "Michelangelo");
        tree.addNode(7, "Donatello");

        System.out.println(tree.getNode(4));
       // System.out.println(tree.getRoot().key);
        tree.showAllNode(tree.getRoot());
    }
}
