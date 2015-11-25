package Kwartiel2.Week3.BoekenKast;

import java.util.ArrayList;

/**
 * Created by Roderik on 25-11-15.
 */
public class Boekenkast {

    private int max;
    private String name;
    ArrayList<Boek> boeken = new ArrayList<Boek>();

    public Boekenkast(int max, String name) {
        this.max = max;
        this.name = name;
    }

    public Boekenkast(ArrayList<Boek> boeken, int max, String name) {
        this(max, name);
        this.boeken = boeken;


    }

    public void AddBook(Boek book){
        if(boeken.size() < max) {
            this.boeken.add(book);
        }
    }

    public void RemoveBook(Boek book){
        if (this.boeken.contains(book)){
            this.boeken.remove(book);
        } else {
            System.out.println("Dit boek is niet aanwezig in de boekenkast.");
        }
    }

}
