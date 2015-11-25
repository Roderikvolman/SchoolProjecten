package Kwartiel2.Week3.BoekenKast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Roderik on 25-11-15.
 */
public class Main {
    public static void main(String[] args){

        ArrayList<Boekenkast> boekenkasten = new ArrayList<Boekenkast>();
        ArrayList<Auteur> auteurs = new ArrayList<Auteur>();
        Auteur alreadyExcistingAutor = null;



        Boekenkast one  = new Boekenkast(94000, "Joopje");
        boekenkasten.add(one);

        for (Auteur element : auteurs){
            if (element.getFirstname() == "Joop" & element.getLastname() == "Jansen"){
                System.out.println("Deze auteur bestaat al");
                alreadyExcistingAutor = element;
            }
        }
        if (alreadyExcistingAutor == null){
            Auteur nieuw = new Auteur("Jansen", "Joop", new Date("1968/12/01"));
            System.out.println(nieuw);
        }

    }
}
