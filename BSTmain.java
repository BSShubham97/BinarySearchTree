package com.bridgelabz;

import java.util.Scanner;

public class BSTmain {

    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter element: ");
            int input = scanner.nextInt();
            if (input == 0)
                break;

            binarySearchTree.add(input);
        }

        binarySearchTree.getSize();
    }
}

