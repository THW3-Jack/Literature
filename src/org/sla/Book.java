package org.sla;

public class Book {

    private String title;
    private String author;
    private int sales;
    private int publish;
    private String language;
    private String genre;

    public Book(String title, String author, int sales, int publish, String language, String genre){
        this.author = author;
        this.genre = genre;
        this.language = language;
        this.publish = publish;
        this.sales = sales;
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}