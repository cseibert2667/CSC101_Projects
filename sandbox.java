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
   // function to add a new element to an existing String array
   // n = number elements in current array
   // arr[] = current array name
   // newElement = element to be added
   public static String[] addToArray(int n, String arr[], String newElement){
      // create a new array size n+1
      String newArray[] = new String[n + 1];

      // insert the elements of the old array into the newly created one
      for (int i = 0; i < n; i++){
         newArray[i] = arr[i];
      }

      // insert new element at n+1
      newArray[n] = newElement;

      // return the new array
      return newArray;
   }

   static void arraysNStuff() {
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

      // call method defined above to add a new element
      friends = addToArray(x, friends, "Megan");

      System.out.println("New friends:");

      for (int i = 0; i < friends.length; i++){
         System.out.println(friends[i]);
      }

   }

   // execute the function in main
   public static void main(String[] args) {
      arraysNStuff();
   }
}