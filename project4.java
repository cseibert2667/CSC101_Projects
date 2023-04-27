import java.util.Scanner;

public class project4 {

    // Calculate AGI and repair any negative values
    public static int calcAGI(int wages, int interest, int unemployment) {
        int agi = Math.abs(wages) + Math.abs(interest) + Math.abs(unemployment);

        return agi;
    }

    // Calculate deduction depending on single, dependent or married
    public static int getDeduction(int status) {
        int deduction = 6000;

        if (status == 1) {
            deduction = 12000;
        }
        else if (status == 2) {
            deduction = 24000;
        }

        return deduction;
    }

    // Calculate taxable but not allow negative results
    public static int calcTaxable(int agi, int deduction) {
        /* Complete the method and update the return statement */

        return -1;
    }

    // Calculate tax for single or dependent
    public static int calcTax(int status, int taxable) {
        /* Complete the method and update the return statement */

        return -1;
    }

    // Calculate tax due and check for negative withheld
    public static int calcTaxDue(int tax, int withheld) {
        /* Complete the method and update the return statement */

        return -1;
    }

    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            int wages = 0;
            int interest = 0;
            int unemployment = 0;
            int status = -1;
            int withheld = 0;
            int agi;
            int deduction;

            // Step #1: Input information
            wages = scnr.nextInt();
            interest = scnr.nextInt();
            unemployment = scnr.nextInt();
            status = scnr.nextInt();
            withheld = scnr.nextInt();

            // Step #2: Calculate AGI
            agi = calcAGI(wages, interest, unemployment);
            System.out.printf("AGI: $%,d\n", agi);
            deduction = getDeduction(status);
            System.out.printf("Deduction: $%,d\n", deduction);
        }

    }
}
