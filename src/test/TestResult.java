package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 7, 5, 1, 8, 3, 6};
        Exercise.sort(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
