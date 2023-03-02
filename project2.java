import java.util.Scanner;
import java.util.Random;

public class project2 {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
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
            int player1wins = 0;
            int player2wins = 0;

            // numRounds must be a positive number
            while (numRounds < 0) {
                System.out.println("Rounds must be > 0");
                numRounds = scnr.nextInt();
            }
            // print player1 vs player2 for x rounds
            System.out.println(player1 + " vs " + player2 + " for " + numRounds + " rounds");

            // random player inputs
            player1Input = rand.nextInt(3);
            player2Input = rand.nextInt(3);

            // loop through for number of rounds
            for (int i = 1; i <= numRounds; i++) {

                // print tie if values the same
                while (player1Input == player2Input) {
                    System.out.println("Tie");
                    player1Input = rand.nextInt(3);
                    player2Input = rand.nextInt(3);
                }

                // identify winner, increment player wins accordingly, get new random player
                // inputs
                if (player2Input == SCISSORS && player1Input == PAPER) {
                    System.out.println(player2 + " wins with scissors");
                    player2wins++;
                    player1Input = rand.nextInt(3);
                    player2Input = rand.nextInt(3);
                } else if (player2Input == ROCK && player1Input == SCISSORS) {
                    System.out.println(player2 + " wins with rock");
                    player2wins++;
                    player1Input = rand.nextInt(3);
                    player2Input = rand.nextInt(3);
                } else if (player2Input == PAPER && player1Input == ROCK) {
                    System.out.println(player2 + " wins with paper");
                    player2wins++;
                    player1Input = rand.nextInt(3);
                    player2Input = rand.nextInt(3);
                } else if (player1Input == SCISSORS && player2Input == PAPER) {
                    System.out.println(player1 + " wins with scissors");
                    player1wins++;
                    player1Input = rand.nextInt(3);
                    player2Input = rand.nextInt(3);
                } else if (player1Input == ROCK && player2Input == SCISSORS) {
                    System.out.println(player1 + " wins with rock");
                    player1wins++;
                    player1Input = rand.nextInt(3);
                    player2Input = rand.nextInt(3);
                } else if (player1Input == PAPER && player2Input == ROCK) {
                    System.out.println(player1 + " wins with paper");
                    player1wins++;
                    player1Input = rand.nextInt(3);
                    player2Input = rand.nextInt(3);
                }

            }

            // print final score
            System.out.println(player1 + " wins " + player1wins + " and " + player2 + " wins " + player2wins);

            // TEST PRINTS
            // System.out.println(player1);
            // System.out.println(player2);
            // System.out.println(numRounds);
        }

    }
}
