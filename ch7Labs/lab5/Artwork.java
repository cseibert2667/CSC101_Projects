package ch7Labs.lab5;

public class Artwork {
    // private fields
    private String title;
    private int yearCreated;
    private Artist artist;

    // default constructor
    public Artwork() {
        title = "unknown";
        yearCreated = -1;
    }

    // get methods
    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    // second constructor to initialize private fields
    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }

    // print method
    public void printInfo() {
        artist.printInfo();
        System.out.println("Title: " + getTitle() + ", " + getYearCreated());
    }

}
