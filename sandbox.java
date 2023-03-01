import java.util.Scanner;

public class sandbox {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {

         String userString = scnr.nextLine();
         String newString = "";

         for (int i = 0; i < userString.length(); i++) {
            char currentChar = userString.charAt(i);
            if (Character.isLetter(currentChar)) {
               newString += userString.substring(i, i+1);
            }
            System.out.println(newString); //print every iteration
         }

      }
      
   }
}