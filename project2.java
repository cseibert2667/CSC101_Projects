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

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(numRounds);
    }
}
