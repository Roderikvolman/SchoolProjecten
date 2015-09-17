/**
 * Created by Roderik on 17-09-15.
 */

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class TTTPanel extends JFrame{

    JPanel p = new JPanel();
    XOButton buttons[] = new XOButton[9];

    public static void main (String args []){
        new TTTPanel();

    }

    public TTTPanel(){
        super("TicTacToe");
        setSize(800,800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(3,3));
        for (int i=0;i<9;i++){
            buttons[i]= new XOButton();
            p.add(buttons[i]);
        }
        add(p);

        setVisible(true);
    }
}
