/**
 * Created by Roderik on 17-09-15.
 */

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class TTTPanel extends JFrame{

    JPanel p = new JPanel();
    XOButton buttons[] = new XOButton[9];

    private static int player = 0;
    private String[][] field;

    public static void main (String args []){

        new TTTPanel().henk();
    }

    public TTTPanel(){
        super("TicTacToe");
    }



    public void henk(){

        setSize(800,800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(3,3));
        for (int i=0;i<9;i++){
            buttons[i]= new XOButton(i);
            p.add(buttons[i]);
            int hor = i % 3;
            int ver = i / 3;
            field[hor][ver] = "" + (i + 1);
        }

        add(p);

        setVisible(true);
    }

    public int playerTurn(){
        return player;
    }

    public void setPlayer(){
        if(player == 0){
            player = 1;
        }else
            player = 0;
    }
}
