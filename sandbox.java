import java.util.Scanner;

public class sandbox {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString = scnr.nextLine();
      char userChar = userString.charAt(0);
      int numReps = 0;

      for (int i = 1; i < userString.length(); i++){
         if (userString.charAt(i) == userChar) {
            numReps++;
         }
      }
      
      if (numReps == 1) {
         System.out.println(numReps + " " + userChar);
      }
      else {
         System.out.println(numReps + " " + userChar + "'s");
      }
      
      //System.out.println(numReps);

   }
}