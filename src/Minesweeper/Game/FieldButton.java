package Minesweeper.Game;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rick on 25-9-2015.
 */
public class FieldButton extends JButton implements ActionListener {

    ImageIcon flag, bomb;
    private String type;

    private int hor;
    private int ver;


    public FieldButton(int x, int y){
        bomb = new ImageIcon(this.getClass().getResource("../Assets/msBom.png"));
        flag = new ImageIcon(this.getClass().getResource("../Assets/msFlag.png"));
        this.addActionListener(this);
        this.setFont(new Font("Arial", Font.PLAIN, 15));
        this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        type = "";
        hor = x;
        ver = y;

    }
//TODO: Game over functie
    public void actionPerformed(ActionEvent e) {
        if(type == "" + 0) {
            new Frame().openArea(hor, ver);
            System.out.println("hello?!?");
        }else if (type != "bomb"){
            reveal();
        }else if (type == "bomb"){
            System.out.println("Game Over");
        }else if (type == "0"){
            new Frame().openArea(hor, ver);
            System.out.println("dit is 0 tussen haakjes");
        }

    }

    public void setType(String x){
//        if (x == "0") { //snap niet waarom dit niet werkt, omweg in frame ingebouwd
//            type = "";
//        }else
            type = x;
        if (type == "bomb"){
            //System.out.println("pas op!");
        }else if (type == "0"){
           // System.out.println("harry");
        }
        //System.out.println(type);
        //this.setText(type);
    }

    public String getType(){
        return type;
    }

    public void reveal(){
        this.setText(type);
    }
}
