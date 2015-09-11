import java.awt.*;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * Created by Roderik on 09-09-15.
 */
public class lingo {
    public static void main(String[] lingo) {
        new lingo().run();

    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        String awnser = "#first###";
        int charCount = awnser.length();

        while (charCount != 6) {
            if (awnser == "#first###") {
                System.out.println("Type the 6 character dutch word to guess");
            } else {
                System.out.println("Please enter 6 characters no more, no less.");
            }
            awnser = sc.next();
            charCount = awnser.length();

        }

        char[] awnserArray = awnser.toCharArray();


        String guess;
        System.out.println("Please guess a 6 char word");
        guess = sc.next();
        int guessCharCount = guess.length();

        char[] guessArray = guess.toCharArray();


        if ((awnserArray[1]) == (guessArray[1])) {
            System.out.println(guessArray[1] + " good place and good char");
        } else {
            int awnserArrayLength = awnserArray.length -1;
            for (int i = 0; i <= awnserArrayLength; i++) {
                if ((guessArray[1]) == awnserArray[i]);
                System.out.println(guessArray[i]);
            }

        }

    }

}

