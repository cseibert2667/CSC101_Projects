package ch6Labs;

import java.util.Scanner;
import java.util.Arrays;

public class lab4 {
    public static int getWordFrequency (String[] arr, int arrSize, String word) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(word)){
                count++;
            }
        }

        return count;
    }

    public static void main (String[] args){
        try (Scanner scnr = new Scanner(System.in)){
            String[] wordList = new String [20];
            int wordListLength = scnr.nextInt();

            
        };

    }
}
