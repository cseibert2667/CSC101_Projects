package ch6Labs;

import java.util.Scanner;
import java.util.Random;

public class lab2 {

    public static String coinFlip(Random rand) {
        int flip = rand.nextInt(2);


        if (flip == 1) {
            return "Heads";
        } else {
            return "Tails";
        }
    }

    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            Random rand = new Random(2);
            int flips = scnr.nextInt();

            for (int i = 0; i < flips; i++) {
                System.out.println(coinFlip(rand));
            }
        }

    }
}
