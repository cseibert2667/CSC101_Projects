
import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            int[] jerseyNum = new int[5];
            int[] rating = new int[5];
            char menuOption;

            // get inputs
            for (int i = 0; i < jerseyNum.length; i++) {
                System.out.println("Enter Player " + (i + 1) + "'s jersey number:");
                jerseyNum[i] = scnr.nextInt();
                System.out.println("Enter Player " + (i + 1) + "'s rating:");
                rating[i] = scnr.nextInt();
            }

            // print roster
            System.out.println("ROSTER");
            for (int i = 0; i < rating.length; i++) {
                System.out
                        .println("Player " + (i + 1) + " -- Jersey number: " + jerseyNum[i] + ", Rating: " + rating[i]);
            }
            System.out.println();
            
            // menu
            do {
                System.out.println("MENU");
                System.out.println("u - Update player rating");
                System.out.println("a - Output players above a rating");
                System.out.println("r - Replace player");
                System.out.println("o - Output roster");
                System.out.println("q - Quit");
                System.out.println();
                System.out.println("Choose an option:");

                menuOption = scnr.next().charAt(0);

                if (menuOption == 'u') { // update player rating
                    System.out.println("Enter a jersey number:");
                    int update = scnr.nextInt();
                    for (int i = 0; i < jerseyNum.length; i++) {
                        if (jerseyNum[i] == update) {
                            System.out.println("Enter a new rating for player:");
                            rating[i] = scnr.nextInt();
                        }
                    }
                    System.out.println();
                    continue;
                }
                if (menuOption == 'a') { // output above rating
                    System.out.println("Enter a rating:");
                    int thresh = scnr.nextInt();
                    System.out.println("ABOVE " + thresh);
                    for (int i = 0; i < rating.length; i++) {
                        if (rating[i] > thresh) {
                            System.out
                                    .println("Player " + (i + 1) + " -- Jersey number: " + jerseyNum[i] + ", Rating: "
                                            + rating[i]);
                        }
                    }
                    System.out.println();
                    continue;
                }
                if (menuOption == 'r') { // replace player
                    System.out.println("Enter a jersey number:");
                    int replace = scnr.nextInt();
                    for (int i = 0; i < jerseyNum.length; i++) {
                        if (jerseyNum[i] == replace) {
                            System.out.println("Enter a new jersey number:");
                            jerseyNum[i] = scnr.nextInt();
                            System.out.println("Enter a rating for the new player:");
                            rating[i] = scnr.nextInt();
                        }
                    }
                    System.out.println();
                    continue;
                }
                if (menuOption == 'o') { // output roster
                    System.out.println("ROSTER");
                    for (int i = 0; i < rating.length; i++) {
                        System.out.println(
                                "Player " + (i + 1) + " -- Jersey number: " + jerseyNum[i] + ", Rating: " + rating[i]);
                    }
                    System.out.println();
                    continue;
                }
            } while (menuOption != 'q'); // quit
        }
    }
}
