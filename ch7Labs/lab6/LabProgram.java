package ch7Labs.lab6;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            VendingMachine vend = new VendingMachine();
            int amount = scnr.nextInt();

            vend.purchase(amount);
            amount = scnr.nextInt();
            vend.restock(amount);
            vend.report();
            /* Type your code here. */

        }
    }
}
