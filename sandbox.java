import java.util.Scanner;
import java.util.Arrays;

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
   public static String[] addToArray(int n, String arr[], String newElement) {
      // create a new array size n+1
      String newArray[] = new String[n + 1];

      // insert the elements of the old array into the newly created one
      for (int i = 0; i < n; i++) {
         newArray[i] = arr[i];
      }

      // insert new element
      newArray[n] = newElement;

      // return the new array
      return newArray;
   }

   // WIP - remove element from an array
   public static String[] removeFromArray(int n, String arr[], String rmvElement) {

      // new array with length 1 less than original
      String newArray[] = new String[n - 1];

      int rmvIndex = Arrays.binarySearch(arr, rmvElement) * -1;

      int i;

      // copy old array into newArray
      for (i = 0; i < n; i++) {
         // UNTIL we hit index of rmv index
         if (i != rmvIndex) {
            newArray[i] = arr[i];
         } else {
            while (i < n - 1) {
               newArray[i] = arr[i + 1];
               i++;
            }
            break;
         }
      }

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

      System.out.println("Original friends: ");

      // print each value in array
      for (int i = 0; i < friends.length; i++) {
         System.out.println("- " + friends[i]);
      }

      // call method defined @ lines 36-50 to add a new element, and assign the
      // returned value to our existing friends array
      friends = addToArray(friends.length, friends, "Megan");

      friends = addToArray(friends.length, friends, "Bonnie");

      System.out.println("New friends:");

      // print only the new additions to original array
      for (int i = 0; i < friends.length; i++) {
         if (i >= x) {
            System.out.println("- " + friends[i]);
         }

      }

      // prints the array in string format ([0,1,2...])
      System.out.println("All friends: " + Arrays.toString(friends));

      // FIX ME: removing "bonnie" removes Dane instead
      friends = removeFromArray(friends.length, friends, "Dane");

      System.out.println(Arrays.toString(friends));

   }

   // zybook 5.13
   static void arraysLab1() {
      try (Scanner scnr = new Scanner(System.in)) {
         int[] userList = new int[20]; // List of numElement integers specified by the user
         int numElements; // Number of integers in user's list
         int i;
         int tempVal;

         numElements = scnr.nextInt(); // Input begins with number of integers that follow

         // get values
         for (i = 0; i < numElements; i++) {
            userList[i] = scnr.nextInt();
         }

         // reverse
         for (int j = 0; j < numElements / 2; j++) {
            tempVal = userList[j];
            userList[j] = userList[numElements - 1 - j];
            userList[numElements - 1 - j] = tempVal;
         }

         for (int j = 0; j < numElements; j++) {
            System.out.print(userList[j] + ",");
         }
      }

   }

   // zybook 5.14
   static void arraysLab2() {
      try (Scanner scnr = new Scanner(System.in)) {
         int[] userValues = new int[9]; // Set of data specified by the user
         int i = 0;
         int input = scnr.nextInt();
         boolean tooMany = false;

         while (input >= 0) {
            if (i == 9) {
               System.out.println("Too many numbers");
               tooMany = true;
               break;
            }
            userValues[i] = input;
            i++;
            input = scnr.nextInt();
         }
         if (!tooMany) {
            System.out.println("Middle item: " + userValues[i / 2]);
         }
      }
   }

   // zybook 5.15
   static void arraysLab3() {
      try (Scanner scnr = new Scanner(System.in)) {
         int[] userValues = new int[20]; // List of integers from input
         int numValues = scnr.nextInt();
         
         // assign values to array
         for (int i = 0; i < numValues; i++) {
            userValues[i] = scnr.nextInt();
         }

         // getting max threshold
         int threshold = scnr.nextInt();

         for (int i = 0; i < numValues; i++) {
            if (userValues[i] <= threshold) {
               System.out.print(userValues[i] + ",");
            }
         }
         System.out.println();


         // test prints
         // System.out.println(Arrays.toString(userValues));
         // System.out.println(threshold);

      }
   }

   // execute methods in main
   public static void main(String[] args) {
      arraysLab3();
   }
}