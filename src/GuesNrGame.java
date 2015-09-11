/**
 * Created by Roderik on 03-09-15.
 */

import java.util.Scanner;

public class GuesNrGame {
    public static void main(String[] args) {
        new GuesNrGame().run();
    }

    public void run() {

        Scanner sc = new Scanner(System.in);

        int guess = 1;
        int count = 0;


        while (guess != 2) {
            if (count == 0) {
                System.out.println("guess a number between 0 and 10");
            } else {
                System.out.println("Wrong number, please try again");
            }

            guess = sc.nextInt();
            count++;
        }
        System.out.println(guess + " Jeeeeej good awnser");

    }
}
