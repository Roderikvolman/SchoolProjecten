package Kwartiel1.Minesweeper;

import javax.swing.*;

/**
 * Created by Roderik on 25-09-15.
 */

public class msTable {

    public int x;
    public int y;

    public void run() {
        JFrame table = new JFrame();
        table.setVisible(true);
        table.setSize(x, y);

    }


    public static void main(String[] msTable) {
        new msTable().run();
    }
}