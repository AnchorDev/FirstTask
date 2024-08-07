package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("\nUser info: " + args[0]);
        } else {
            System.out.println("No user info provided.");
        }

        int[] array = {34, 7, 23, 32, 5, 62, 32, 64, 12, 22, 45, 78, 21, 54, 33, 90, 10, 11, 6, 3, 99, 2, 1, 88, 15, 43, 56, 77, 38, 19, 44, 55, 76, 39, 41, 25, 14, 17, 18, 29, 30, 50, 59, 28, 27, 26, 13, 4, 16, 8};
        System.out.println("\nUnsorted array:");
        Quicksort.printArray(array);

        Quicksort.quickSort(array, 0, array.length - 1);
        System.out.println("\nSorted array:");
        Quicksort.printArray(array);
    }
}