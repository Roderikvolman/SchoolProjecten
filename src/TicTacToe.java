/**
 * Created by Roderik on 11-09-15.
 */
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] TicTacToe) {


        new TicTacToe().run();

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String[][] field = new String[3][3];

       /* for(int i = 0; i < field[1].length; i++){// Rick Algorithme
            for (int j = 0; j < field[0].length; j++){
                field[j][i] = (char)((i * 3) + (j + 1));
            }
        }*/

        for(int i = 0; i <= 8; i ++){// Roderik algorithme
           int hor = i%3;
           int ver = i/3;
            field[hor][ver] = "" + (i + 1);
        }

        System.out.println("| " + field[0][0] + " | " + field[1][0] + " | " + field[2][0] + " |");
        System.out.println("--------------");
        System.out.println("| " + field[0][1] + " | " + field[1][1] + " | " + field[2][1] + " |");
        System.out.println("--------------");
        System.out.println("| " + field[0][2] + " | " + field[1][2] + " | " + field[2][2] + " |");

        String one = "Player 1";
        String two = "Player 2";
        int invul = 0;
        int turns = 0;


        while (turns <9) {
            if(turns%2 == 0) {
                System.out.println("turn for " + one);
                invul = sc.nextInt();
                field[(invul-1)%3][(invul-1)/3] = "V";
            }
            else{
                System.out.println("turn for " + two);
                invul = sc.nextInt();
                field[(invul-1)%3][(invul-1)/3] = "H";
            }

            System.out.println("| " + field[0][0] + " | " + field[1][0] + " | " + field[2][0] + " |");
            System.out.println("--------------");
            System.out.println("| " + field[0][1] + " | " + field[1][1] + " | " + field[2][1] + " |");
            System.out.println("--------------");
            System.out.println("| " + field[0][2] + " | " + field[1][2] + " | " + field[2][2] + " |");

            ++turns;
        }








    }



}
