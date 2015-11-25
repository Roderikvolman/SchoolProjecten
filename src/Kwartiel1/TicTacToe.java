package Kwartiel1.Minesweeper; /**
 * Created by Roderik on 11-09-15.
 */

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] TicTacToe) {


        new TicTacToe().run();

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Welcome to TicTacToe");
//        System.out.println("-----------------");
//        System.out.println("|1) Fill in names|");
//        System.out.println("|2) Choose icons |");
//        System.out.println("|3) Play         |");
//        System.out.println("-----------------");
//
//        int menu = sc.nextInt();
//
//        if (menu == 1) {
//
//        }//

        int R = 0;
        int O = 0;

        System.out.println("Hoeveel vakjes in de breedte moet het veld zijn?");
        R = sc.nextInt();
        System.out.println("Hoeveel vakjes in de hoogte moet het veld zijn?");
        O = sc.nextInt();

        String lijn = "----";
        String[][] field = new String[R][O];


        for (int i = 0; i <= (R * O - 1); i++) {
            int hor = i % R;
            int ver = i / R;
            field[hor][ver] = "" + (i + 1);

            if (i + 1 < 10) {
                System.out.print("| " + field[hor][ver] + " ");

                if ((i + 1) % R == 0) {
                    System.out.println("");
                    for (int l = 0; l < R; l++) {
                        System.out.print(lijn);
                    }
                    System.out.println("");

                }
            } else if (i + 1 < 100) {

                System.out.print("| " + field[hor][ver] + "");

                if ((i + 1) % R == 0) {
                    System.out.println("");
                    for (int l = 0; l < R; l++) {
                        System.out.print(lijn);
                    }
                    System.out.println("");
                }
            } else {
                System.out.print("|" + field[hor][ver] + "");

                if ((i + 1) % R == 0) {
                    System.out.println("");
                    for (int l = 0; l < R; l++) {
                        System.out.print(lijn);
                    }
                    System.out.println("");

                }
            }
        }




        String one = "Player 1";
        String two = "Player 2";
        int invul = 0;
        int turns = 0;


        while (!(checkrow(1, 1, field) || checkrow(1, 3, field) || checkrow(1, 4, field) || checkrow(3, 2, field) || checkrow(4, 1, field) || checkrow(7, 1, field) || checkrow(3, 3, field) || checkrow(2, 3, field))) {
            if (turns % 2 == 0) {

                System.out.println("turn for " + one);
                invul = sc.nextInt();
                field[(invul - 1) % 3][(invul - 1) / 3] = "x";
            } else {
                System.out.println("turn for " + two);
                invul = sc.nextInt();
                field[(invul - 1) % 3][(invul - 1) / 3] = "o";
            }

            System.out.println("| " + field[0][0] + " | " + field[1][0] + " | " + field[2][0] + " |");
            System.out.println("--------------");
            System.out.println("| " + field[0][1] + " | " + field[1][1] + " | " + field[2][1] + " |");
            System.out.println("--------------");
            System.out.println("| " + field[0][2] + " | " + field[1][2] + " | " + field[2][2] + " |");
            turns++;
        }

        System.out.println("Winneeer: ");

    }


    public boolean checkrow(int id, int steps, String[][] field) {
        int count;


        for (int i = 1; i < 3; i++) {
            count = (id - 1) + (steps * i);
            if (!field[count % 3][count / 3].equals(field[(id - 1) % 3][(id - 1) / 3])) {
                return false;
            }
        }
        return true;
    }


}
