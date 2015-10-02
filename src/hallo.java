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

        int[] hello = new int[aantal];

        for (int i = 0; i < aantal; i++) {
            hello[i] = i + 1;
            System.out.println(hello[i]);

        }
        if (aantal % 2 == 0) {
            int[] equalHello = new int[aantal - 2];


            int p = 0;
            for (int i = 0; i < aantal - 2; i++) {
                if (i == (aantal-1)/2){
                    p = p + 2;
                }
                p++;
                equalHello[i] = hello[p];
                System.out.println(equalHello[i]);
            }
        }
    }

}


