package org.sla;

public class Manga extends Book {

private String publisher;
private String demographic;
private int volumes;

    public Manga(String title, String author, int sales, int publish, String language, String genre, String myPublisher, String myDemographic, int myVolumes) {
        super(title, author, sales, publish, language, genre);
        publisher = myPublisher;
        demographic = myDemographic;
        volumes = myVolumes;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDemographic() {
        return demographic;
    }

    public void setDemographic(String demographic) {
        this.demographic = demographic;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }
}
