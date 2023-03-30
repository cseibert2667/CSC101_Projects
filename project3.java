
import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)){
            int[] jerseyNum = new int[5];
            int[] rating = new int[5];

            // get inputs
            for (int i = 0; i < jerseyNum.length; i++) {
                System.out.println("Enter Player " + (i+1) + "'s jersey number:");
                jerseyNum[i] = scnr.nextInt();
                System.out.println("Enter Player " + (i+1) + "'s rating:");
                rating[i] = scnr.nextInt();
            }

            // print roster
            for (int i = 0; i < rating.length; i++) {
                System.out.println("ROSTER");
            }
        }
    }
}
