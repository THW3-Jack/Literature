package org.sla;

public class Main {

    public static void main(String[] args) {
        System.out.println("These are the top-selling literature of all time:");
        Book.describeBook();

        System.out.println("These are the top-selling Manga of all time:");
        Manga.describeManga();

        //Manga manga1 = new Manga("One Piece", "Eiichiro Oda", 455000000, 1997, "japanese", "manga", "Shueisha", "Shonen", 94);
        // System.out.println(manga1.getLanguage());

	// write your code here
    }
}
