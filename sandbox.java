import java.util.Scanner;

public class sandbox {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {

         String userString = scnr.nextLine();

         for (int i = 0; i < userString.length(); i++) {
            char currentChar = userString.charAt(i);
            if (!Character.isLetter(currentChar)) {
               userString = userString.replace(currentChar,'\0');
            }
            System.out.println(userString);
         }

      }
      
   }
}