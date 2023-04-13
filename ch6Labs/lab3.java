package ch6Labs;

import java.util.Scanner;

public class lab3 {

    public static void sortArray(int[] myArr, int arrSize) {
        for (int i = 0; i < arrSize; i++) {
            for (int j = arrSize - 1; j > i; j--) {
                if (myArr[j] > myArr[j - 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j - 1];
                    myArr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            int[] numbers = new int[20];

            int arrLength = scnr.nextInt();

            // build array
            for (int i = 0; i < arrLength; i++) {
                numbers[i] = scnr.nextInt();
            }

            sortArray(numbers, arrLength);

            for (int i = 0; i < arrLength; i++) {
                System.out.print(numbers[i] + ",");
            }

            System.out.println();
        }

    }
}
