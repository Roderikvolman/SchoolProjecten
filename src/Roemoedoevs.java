import java.io.*;
import java.util.Scanner;

/**
 * Created by Roderik on 06-11-15.
 */
public class Roemoedoevs {


    public static void main(String args[]) {
        new Roemoedoevs().translate();
    }

    public void translate() {
        System.out.println("Welkom bij het vertaalprogramma Roemoedoevs. Voer nu een zin of woord in die uv vertaald wilt hebben.");
        Scanner invoer = new Scanner(System.in);
        String strToTransalte = invoer.nextLine();
        String strTranslated;

        strTranslated = strToTransalte.replaceAll("[aioue]", "oe");
        strTranslated = strTranslated.replace("oec", "oc");
        strTranslated = strTranslated.replace("oew", "oe");
        strTranslated = strTranslated.replace("oeoe", "oe");
        strTranslated = strTranslated.replace("oej", "oe");
        System.out.println(strTranslated);

    }
}

