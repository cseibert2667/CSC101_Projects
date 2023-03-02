import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            double wallHeight = scnr.nextDouble();
            double wallWidth = scnr.nextDouble();
            double canPrice = scnr.nextDouble();
            double wallArea = wallHeight * wallWidth;
            double paintNeeded = wallArea / 350.0;
            int cansNeeded = (int) paintNeeded + 1;
            double totalPaintCost = canPrice * cansNeeded;
            double salesTax = totalPaintCost * 0.07;

            System.out.printf("Wall area: %.1f sq ft\n", wallArea);
            System.out.printf("Paint needed: %.3f gallons\n", paintNeeded);
            System.out.println("Cans needed: " + cansNeeded + " can(s)");
            System.out.printf("Paint cost: $%.2f\n", totalPaintCost);
            System.out.printf("Sales tax: $%.2f\n", salesTax);
            System.out.printf("Total cost: $%.2f\n", (totalPaintCost + salesTax));
        }

    }
}
