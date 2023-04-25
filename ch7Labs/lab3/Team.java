package ch7Labs.lab3;

public class Team {
    // private fields
    private String name;
    private int wins;
    private int losses;

    // mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public double getWinPercentage() {
        return (double) wins / ((double) wins + (double) losses);
    }

    // print method
    public void printStanding() {
        System.out.printf("Win percentage: %.2f \n", getWinPercentage());
        if (getWinPercentage() >= 0.5) {
            System.out.println("Congratulations, Team " + name + " has a winning average!");
        } else {
            System.out.println("Team" + name + " has a losing average.");
        }
    }

}
