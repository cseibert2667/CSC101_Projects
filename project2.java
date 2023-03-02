import java.util.Scanner;
import java.util.Random;

public class project2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSORS = 2;
        Random rand = new Random();
        int seed = scnr.nextInt();
        rand.setSeed(seed);
        // get inputs
        String player1 = scnr.next();
        String player2 = scnr.next();
        int numRounds = scnr.nextInt();
        // other variables
        int player1Input;
        int player2Input;

        // numRounds must be a positive number
        while (numRounds < 0){
            System.out.println("Rounds must be > 0");
            numRounds = scnr.nextInt();
        }
        // print player1 vs player2 for x rounds
        System.out.println(player1 + " vs " + player2 + " for " + numRounds + " rounds");

        // random inputs
        player1Input = rand.nextInt(3);
        player2Input = rand.nextInt(3);
        
        for (int i = 1; i <= numRounds; i++) {
        // print tie if values the same
        while (player1Input == player2Input) {
            System.out.println("Tie");
            player1Input = rand.nextInt(3);
            player2Input = rand.nextInt(3);
        }

            // identify winner
            if (player2Input == SCISSORS && player1Input == PAPER) {
                System.out.println(player2 + " wins with scissors");
                player1Input = rand.nextInt(3);
                player2Input = rand.nextInt(3);
                //continue;
            } else if (player2Input == ROCK && player1Input == SCISSORS) {
                System.out.println(player2 + " wins with rock");
                player1Input = rand.nextInt(3);
                player2Input = rand.nextInt(3);
                //continue;
            } else if (player2Input == PAPER && player1Input == ROCK) {
                System.out.println(player2 + " wins with paper");
                player1Input = rand.nextInt(3);
                player2Input = rand.nextInt(3);
                //continue;
            } else if (player1Input == SCISSORS && player2Input == PAPER) {
                System.out.println(player1 + " wins with scissors");
                player1Input = rand.nextInt(3);
                player2Input = rand.nextInt(3);
                //continue;
            } else if (player1Input == ROCK && player2Input == SCISSORS) {
                System.out.println(player1 + " wins with rock");
                player1Input = rand.nextInt(3);
                player2Input = rand.nextInt(3);
                //continue;
            } else if (player1Input == PAPER && player2Input == ROCK) {
                System.out.println(player1 + " wins with paper");
                player1Input = rand.nextInt(3);
                player2Input = rand.nextInt(3);
                //continue;
            }

        }
        
        
        
        // TEST PRINTS
        // System.out.println(player1);
        // System.out.println(player2);
        // System.out.println(numRounds);
        
    }
}
