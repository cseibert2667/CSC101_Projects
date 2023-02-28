import java.util.Scanner;

public class sandbox {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int stop;
      int result;
      int n;
      
      stop = scnr.nextInt();
      result = 0;
      
      for (n = 0; n < 10; ++n) {
         result += n + 3;
         if (result > stop) {
            System.out.println("n=" + n);
            break;
         }
         System.out.println(result);
      }
   }
}