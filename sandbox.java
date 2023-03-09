import java.util.Scanner;

public class sandbox {

   // DEFINE a new method (aka function)
   static void backwardString() {

      try (Scanner scnr = new Scanner(System.in)) {
         // get input
         String userString = scnr.nextLine();
         String backwards = "";

         // if input != "done", "Done", or "d"
         while (!userString.equals("done") && !userString.equals("Done") && !userString.equals("d")) {
            // iterate through each character, starting from the last
            for (int i = userString.length() - 1; i >= 0; i--) {
               // add each character to a new string until out of characters
               backwards += userString.substring(i, i + 1);
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

   static void ArraysNStuff() {
      // array declaration w/ 3 elements
      final int x = 3;
      String[] friends = new String[x];

      // define each element
      friends[0] = "Jinx";
      friends[1] = "Dane";
      friends[2] = "Semp";

      // print each value in array
      for (int i = 0; i < friends.length; i++){
         System.out.println(friends[i]);
      }

   }

   // execute the function in main
   public static void main(String[] args) {
      ArraysNStuff();
   }
}