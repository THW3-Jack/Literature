package org.sla;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Book {

    static private ArrayList<Book> books;

    private String title;
    private String author;
    private String sales;
    private int publish;
    private String language;
    private String genre;

    public Book(String title, String author, String language, int publish, String sales, String genre){
        this.author = author;
        this.genre = genre;
        this.language = language;
        this.publish = publish;
        this.sales = sales;
        this.title = title;

    }

    static void readBook() {
        if (books != null) {
            // albums have already been read from file
            return;
        }

        // create array list class field where albums will be stored
        books = new ArrayList<Book>();

        try {
            // scan data file line-by-line
            File bookDataFile = new File("res/Book Data");
            Scanner scanner = new Scanner(bookDataFile);
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                Scanner lineScanner = new Scanner(str);
                lineScanner.useDelimiter("#");
                // scan data files line by separating text between #

                // first 4 data values are always present in each line
                String title = lineScanner.next();
                String author = lineScanner.next();
                String language = lineScanner.next();
                int publish = lineScanner.nextInt();
                String sales = lineScanner.next();
                String genre = lineScanner.next();
                // Some lines have certified sales value, then claimed sales value
                //  But some lines have only claimed sales value, no certified sales value
                // try reading first sales amount as a float (since certified sales value is a float)

                Book newBook = new Book(title, author, language, publish, sales, genre);
                books.add(newBook);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    static void describeBook() {
        if (books == null) {
            // read the albums from file
            readBook();
        }

        for (int i = 0; i < books.size(); i++) {
            books.get(i).describe();
        }

        // Example of how to use forEach() instead of for loop
        // albums.forEach((album) -> album.describe());
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

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
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

    public void describe() {
        System.out.println("Book: " + title);


    }


}