package ch6Labs;

import java.util.Scanner;
import java.util.Arrays;

public class lab1 {

    public static void swapValues (int[] arr){
        int temp;

        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        
        temp = arr[2];
        arr[2] = arr[3];
        arr[3] = temp;
    }

    public static void main (String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            int array[] = new int[4];

            // build array
            for (int i = 0; i < array.length; i++) {
                array[i] = scnr.nextInt();
            }

            swapValues(array);
            
            for (int i = 0; i < array.length; i++) {
               
               if (i == 3) {
                  System.out.println(array[i]);
               }
               else {
                System.out.print(array[i] + " ");
               }
            }
            

            // test print
            System.out.println(Arrays.toString(array));
        }

    }
}
