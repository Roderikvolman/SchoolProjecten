package Kwartiel1.Minesweeper;

import java.util.Scanner;

/**
 * Created by Roderik on 02-10-15.
 */
public class GeldWisselGeldDing {
    public static void main(String[] args) {

        new GeldWisselGeldDing().run();
    }

    Scanner sc = new Scanner(System.in);

    public void run() {

        System.out.println("Te betalen bedrag in centen");
        int bedrag = sc.nextInt();
        System.out.println("Betaald door klant in centen");
        int ontvangen = sc.nextInt();
        int teruggeven = ontvangen - bedrag;

        int[] geld = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};

        for (int type: geld){
            if (teruggeven/type != 0){
                System.out.println(type/100.0 + " euro " + teruggeven/type + " x");
            }
            teruggeven = teruggeven%type;
        }
    }
}


