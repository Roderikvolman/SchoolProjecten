package Kwartiel1.Minesweeper;

import java.util.Scanner;

/**
 * Created by Roderik on 23-09-15.
 */
public class Week4 {

    Scanner sc = new Scanner(System.in);

    int start;
    int end;


    public void printNumbersBetween(){
        System.out.println("Voor een begintal in");
        start = sc.nextInt();
        System.out.println("Voer een eindgetal in");
        end = sc.nextInt();
        System.out.println("Ik print alle getallen uit voor je die er tussen in zitten");
        for(int i = start + 1; i<end; i++){
            System.out.println(i );
        }
    }

    public void hello(){
        String original = "";
        String reverse = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Voer een woord in om te checken of het een Plalindrome is");
        original = sc.nextLine();

        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) {
            System.out.println(original + " en " + reverse + " Zoals je ziet is een Palindrome");
            System.out.println("Entered string is a palindrome.");
        } else {
            System.out.println(original + " en" + reverse + " Zoals je ziet is geen Palindrome");

        }
    }

    public void run(){
//        printNumbersBetween();
        hello();
}

    public static void main(String[] Week4){
        new Week4().run();
    }
}
