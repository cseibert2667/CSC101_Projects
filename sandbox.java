import java.util.Scanner;

public class sandbox {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         int n;
         int i;
  
         System.out.println("Enter an integer:");
         n = scnr.nextInt();
  
         System.out.print("Sequence: ");
         if (n % 2 != 0) {
            n--;
         }
         if (n < 0) {
            System.out.println("0 ");
         } else {
         for (i = n; i >= 0; i -= 2) {
            System.out.print(i + " ");
         }
         System.out.println();
         }
      }
   }
}