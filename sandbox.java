import java.util.Scanner;

public class sandbox {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {

         // get input
         String userString = scnr.nextLine();
         String backwards = "";

         // if input != "done", "Done", or "d"
         while (!userString.equals("done") && !userString.equals("Done") && !userString.equals("d")){
            // iterate through each character, starting from the last
            for (int i = userString.length() - 1; i >= 0; i--){
               // add each character to a new string until out of characters
               backwards += userString.substring(i, i+1);
            }
            // print
            System.out.println(backwards);
            // get new input
            userString = scnr.nextLine();
            // clear out backwards string
            backwards = "";
            // start back at while loop
            continue;
         }

      }
      
   }
}