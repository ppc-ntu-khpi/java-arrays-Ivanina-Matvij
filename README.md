
# Практична робота "Масиви, вирази, керування виконанням програми"

## Код програми Exercise:

```Java

package domain;

public class Exercise {
    public static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        int blockSize = 1;
        while (blockSize < arr.length) {
            mergePass(arr, temp, blockSize);
            blockSize *= 2;
            mergePass(temp, arr, blockSize);
            blockSize *= 2;
        }
    }

    public static void mergePass(int[] input, int[] output, int blockSize) {
        int n = input.length;
        int i = 0;
        while (i < n) {
            merge(input, output, i, blockSize);
            i += blockSize * 2;
        }
        for (i = 0; i < n; i++) {
            input[i] = output[i];
        }
    }

    public static void merge(int[] input, int[] output, int start, int blockSize) {
        int i = start;
        int mid = Math.min(start + blockSize, input.length);
        int j = mid;
        int end = Math.min(start + blockSize * 2, input.length);
        int k = start;

        while (i < mid && j < end) {
            if (input[i] < input[j]) {
                output[k++] = input[i++];
            } else if (input[i] > input[j]) {
                output[k++] = input[j++];
            } else {
                i++;
            }
        }

        while (i < mid) {
            output[k++] = input[i++];
        }

        while (j < end) {
            output[k++] = input[j++];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 7, 5, 1, 8, 3, 6};
        sort(arr);
        printArray(arr);
    }
}


```
Я імпортував бібліотеку java.util.
## Код програми TestResult:

```Java
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

```

## Резултат:
<img src="https://github.com/ppc-ntu-khpi/java-arrays-Ivanina-Matvij/blob/master/Image/test.png" />

