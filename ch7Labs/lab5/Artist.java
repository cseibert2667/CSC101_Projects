package ch7Labs.lab5;

public class Artist {
    // private fields
    private String artistName;
    private int birthYear;
    private int deathYear;

    // default constructor
    public Artist(){
        artistName = "unknown";
        birthYear = -1;
        deathYear = -1;
    }

    // second constructor to initialize private fields
    public Artist(String name, int birth, int death){
        artistName = name;
        birthYear = birth;
        deathYear = death;
    }

    // get methods
    public String getName(){
        return artistName;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public int getDeathYear(){
        return deathYear;
    }

    // print method
    public void printInfo(){
        if (deathYear < 0) {
            System.out.println("Artist: " + getName() + " (" + getBirthYear() + " to present)");
        }
        else if (birthYear < 0 && deathYear < 0) {
            System.out.println("Artist: " + getName() + " (unknown)");
        }
        else {
            System.out.println("Artist: " + getName() + " (" + getBirthYear() + " to " + getDeathYear() + ")");
        }
    }
}
