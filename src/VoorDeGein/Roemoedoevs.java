import java.io.*;
import java.util.Scanner;

/**
 * Created by Roderik on 06-11-15.
 */
public class Roemoedoevs {


    public static void main(String args[]) {
        new Roemoedoevs().translate();
    }
    Scanner invoer = new Scanner(System.in);
    String strTranslated;
    String strToTransalte;
    public void translate() {
        System.out.println("Welkom bij het vertaalprogramma Roemoedoevs. ");
        System.out.println("Voer nu een zin of woord in die uv vertaald wilt hebben.");

        strToTransalte = invoer.nextLine();
        //Hier word de vertaling gedaan.
        strTranslated = strToTransalte.replaceAll("[aioueAIOUE]", "oe").replace("oeoeoe", "oe").replace("oeoe", "oe").replace("oec", "ock").replace("oek", "ock").replace("oew", "oe").
                replace("oej", "oe").replace(" oc", " oe").replace(". o", ". O");

        System.out.println(strTranslated);

    }
}

