/**
 * Created by Roderik on 17-09-15.
 */

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class XOButton extends JButton implements ActionListener {

    ImageIcon X,O;
    private int cubicle;

    public XOButton(int i)  {
        X = new ImageIcon(this.getClass().getResource("X.png"));
        O = new ImageIcon(this.getClass().getResource("O.png"));
        this.addActionListener(this);
        cubicle = i;
    }

    public void actionPerformed(ActionEvent e) {
        int play;
        play = new TTTPanel().playerTurn();
        switch (play){
            case 0:
                setIcon(X);
                break;
            case 1:
                setIcon(O);
                break;
        }

        new TTTPanel().setPlayer();
        System.out.println(cubicle);

    }
}
