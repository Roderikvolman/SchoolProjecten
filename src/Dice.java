/**
 * Created by Roderik on 08-09-15.
 */

import java.util.Scanner;
import java.util.Random;

public class Dice {


    public static void main(String[] Dice) {
        Scanner sc = new Scanner(System.in);

        Dice lt = new Dice();
        lt.one();
        lt.two();

        lt.one();
        System.out.println("How many times do you like to roll the dice");
        int count = sc.nextInt();
        Random dice = new Random();
        for (int idx = 1; idx <= count; ) {
            int randomInt = dice.nextInt(6) + 1;
            System.out.println(randomInt);
            ++idx;
        }

        lt.two();

        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;

        System.out.println("How many times do you like to roll the dice");
        int rolls = sc.nextInt();
        Random roll = new Random();
        for (int idx = 1; idx <= rolls; ) {
            int randomRoll = roll.nextInt(6) + 1;
            if (randomRoll == 1) {
                ++one;
            } else if (randomRoll == 2) {
                ++two;
            } else if (randomRoll == 3) {
                ++three;
            } else if (randomRoll == 4) {
                ++four;
            } else if (randomRoll == 5) {
                ++five;
            } else if (randomRoll == 6) {
                ++six;
            }
            ++idx;
        }
        System.out.println("number one " + one);
        System.out.println("number two " + two);
        System.out.println("number three " + three);
        System.out.println("number four " + four);
        System.out.println("number five " + five);
        System.out.println("number six " + six);
    }

    public void one() {

    }

    public void two() {

    }
}
