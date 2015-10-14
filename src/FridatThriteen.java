import java.util.Scanner;

/**
 * Created by Roderik on 02-10-15.
 */
public class FridatThriteen {
    public static void main(String[] args) {

        new FridatThriteen().run();
    }

    Scanner sc = new Scanner(System.in);

    public void run() {
//people will fill in the year they will start with. And over how many years the program has to look.
        int startYear = sc.nextInt();
        int countYear = sc.nextInt();


    }

    public boolean ly(int year) {
        if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0)
            return true;
        else
            return false;
    }

}


