package Kwartiel2.Week3.BoekenKast;

/**
 * Created by Roderik on 25-11-15.
 */
public class Boek {
    private String isbn;
    private String titel;
    private int pageCount;
    private Auteur autor;

    public Boek(String isbn, String titel, int pageCount, Auteur autor) {
        this.isbn = isbn;
        this.titel = titel;
        this.pageCount = pageCount;
        this.autor = autor;
    }

}
