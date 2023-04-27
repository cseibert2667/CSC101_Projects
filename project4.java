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
        } else if (status == 2) {
            deduction = 24000;
        }

        return deduction;
    }

    // Calculate taxable but not allow negative results
    public static int calcTaxable(int agi, int deduction) {
        int taxable = agi - deduction;

        if (taxable < 0) {
            taxable = 0;
        }

        return taxable;
    }

    // Calculate tax for single or dependent
    public static int calcTax(int status, int taxable) {
        double tax;

        if (status == 0 || status == 1){
            if (taxable <= 10000){
                tax = (double)taxable * .1;
            }
            else if (taxable > 10000 && taxable <= 40000){
                tax = 1000 + (((double)taxable - 10000) * .12 );
            }
            else if (taxable > 40000 && taxable <= 85000){
                tax = 4600 + (((double)taxable - 40000) * .22);
            }
            else {
                tax = 14500 + (((double)taxable - 85000) * .24);
            }
        }
        else {
            if (taxable <= 20000){
                tax = (double)taxable * .1;
            }
            else if (taxable > 20000 && taxable <= 80000){
                tax = 2000 + (((double)taxable - 20000) * .12 );
            }
            else {
                tax = 9200 + (((double)taxable - 80000) * .22 );
            }
        }

        tax = Math.round(tax);

        return (int)tax;
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
            int taxable;
            int tax;

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
            taxable = calcTaxable(agi, deduction);
            System.out.printf("Taxable income: $%,d\n", taxable);
            tax = calcTax(status, taxable);
            System.out.printf("Federal tax: $%,d\n", tax);

        }

    }
}
