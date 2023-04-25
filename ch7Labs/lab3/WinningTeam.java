package ch7Labs.lab3;

import java.util.Scanner;

public class WinningTeam {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        Team team = new Team();
          
          String name = scnr.next();
          int wins = scnr.nextInt();
          int losses = scnr.nextInt();
          
          team.setName(name);
          team.setWins(wins);
          team.setLosses(losses);
          
          team.printStanding();
    }
   }
}

