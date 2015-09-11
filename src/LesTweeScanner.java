/**
 * Created by Roderik on 02-09-15.
 */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;


public class LesTweeScanner {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] LesTweeScanner) {

        LesTweeScanner lt = new LesTweeScanner();

        lt.one();
        lt.two();
        lt.three();
        lt.four();
        lt.five();
    }

    public void one() {
        System.out.println("Hello, Tristan;");

    }

    public void two() {
        int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println(" opsomming van 1 t/m resulteert in " + sum);

    }

    public void three() {
        System.out.println("   +");
        System.out.println("  + +");
        System.out.println(" +   +");
        System.out.println("+-----+");
        System.out.println("|  _  |");
        System.out.println("|     |");
        System.out.println("| | | |");
        System.out.println("| | | |");
        System.out.println("+_+_+_|");

    }

    public void four() {

        System.out.println("Write down an even number");
        int someUserInt = sc.nextInt();
        System.out.println("Devide it by 2 and you get: " + someUserInt / 2);

        System.out.println("Write down your name");
        String someUserString = sc.next();

        System.out.println("Hi there " + someUserString + " Are you a boy? type in true or false");
        boolean someUserBoolean = sc.nextBoolean();
        if (someUserBoolean == false) {
            System.out.println("Wrong awnser its " + someUserBoolean + " dont be shy, just be honest");
        } else {
            System.out.println("Wrong awnser, you lady");
        }

    }

    public void five(){
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;

        System.out.println("Enter the first number");
        firstNumber = sc.nextInt();

        System.out.println("Enter the second number");
        secondNumber = sc.nextInt();

        System.out.println("Enter the third number");
        thirdNumber = sc.nextInt();

        System.out.println("Enter the fourth number");
        fourthNumber = sc.nextInt();

        sc.close();

    }

}
