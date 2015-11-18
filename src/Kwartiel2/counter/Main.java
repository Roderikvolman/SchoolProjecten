package Kwartiel2.counter;

import java.util.Scanner;

/**
 * Created by Roderik on 18-11-15.
 */
public class Main {
    public static void main(String[] args) {
        Count tally = new Count();

        Scanner userInput = new Scanner(System.in);

        System.out.println("1 = count +");
        System.out.println("2 = count -");
        System.out.println("0 = reset count");
        System.out.println("9 = quit program");
        int choice = userInput.nextInt();

        while (choice != 9) {
            if (choice == 1) {
                tally.addCount();
            } else if (choice == 2) {
                tally.undoCount();
            } else {
                tally.resetCount();
            }
            System.out.println(tally.getValue());
            choice = userInput.nextInt();
        }
    }
}
