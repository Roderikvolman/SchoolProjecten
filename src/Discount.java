/**
 * Created by Roderik on 03-09-15.
 */

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        new Discount().run();
    }

    public void run() {

        Scanner sc = new Scanner(System.in);

        double count = 0;
        double discount = 0;

        System.out.println("Please enter the price");
        count = sc.nextInt();

        while (count != -1) {

            System.out.println("Please enter your discount%");
            discount = sc.nextInt();
            System.out.println("Your discount is " + discount + "%. Your new price is €" + count * ((100 - discount) / 100));



        }

    }
}
