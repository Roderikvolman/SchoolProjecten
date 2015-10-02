import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Roderik on 30-09-15.
 */
public class hallo {
    public static void main(String[] args) {

        new hallo().run();

    }

    public void run() {

        int aantal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hee hoeveel getallen wil je hebben?");
        aantal = sc.nextInt();

        int[] arrayoOne = new int[aantal];

        for (int i = 0; i < aantal; i++) {
            arrayoOne[i] = i + 1;
            System.out.println(arrayoOne[i]);

        }
        if (aantal % 2 == 0) {
            int[] arrayTwo = new int[aantal - 2];
            int oud;
            int nieuw = 0;

            for (oud = 0; oud < aantal; oud++) {
                if (oud == (aantal - 1) / 2) {
                    oud = oud + 2;
                    arrayTwo[nieuw] = arrayoOne[oud];
                    System.out.println(arrayTwo[nieuw]);
                    nieuw++;
                } else {
                    arrayTwo[nieuw] = arrayoOne[oud];
                    System.out.println(arrayTwo[nieuw]);
                    nieuw++;
                }
            }
        }
    }
}


