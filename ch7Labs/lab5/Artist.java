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

    // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()

    // TODO: Define printInfo() method
    // If deathYear is entered as -1, only print birthYear

}
