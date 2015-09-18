/**
 * Created by Roderik on 17-09-15.
 */

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class TTTPanel extends JFrame {

    JPanel p = new JPanel();
    XOButton buttons[] = new XOButton[9];

    private static int player = 0;
    private String[][] field = new String[3][3];

    public static void main(String args[]) {

        new TTTPanel().henk();
    }

    public TTTPanel() {
        super("TicTacToe");
    }


    public void henk() {

        setSize(800, 800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new XOButton(i);
            p.add(buttons[i]);
            int hor = i % 3;
            int ver = i / 3;
            field[hor][ver] = "" + (i + 1);
        }

        add(p);

        setVisible(true);
    }

    public int playerTurn() {
        return player;
    }

    public void setPlayer() {
        if (player == 0) {
            player = 1;
        } else
            player = 0;
    }

    public void defineClick(int i) {
        //while (!(checkrow(1, 1, field) || checkrow(1, 3, field) || checkrow(1, 4, field) || checkrow(3, 2, field) || checkrow(4, 1, field) || checkrow(7, 1, field) || checkrow(3, 3, field) || checkrow(2, 3, field))) {
            if (player % 2 == 0) {
                field[(i - 1) % 3][(i - 1) / 3] = "x";
            } else {
                field[(i - 1) % 3][(i - 1) / 3] = "o";
            }
            //System.out.println("Winneeer: ");
        //}


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