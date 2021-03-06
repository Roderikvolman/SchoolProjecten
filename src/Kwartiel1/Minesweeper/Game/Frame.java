package Kwartiel1.Minesweeper.Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Rick on 25-9-2015.
 */
public class Frame {

    private static String frame[][];//true is safezone
    private static int hor;
    private static int ver;
    private static int bom;
    JFrame panel = new JFrame();
    static FieldButton buttons[][];

    public void initiate(int x, int y, int z){
        hor = x;
        ver = y;
        bom = z;
        //frame = new String[hor][ver];
        buttons = new FieldButton[hor][ver];
    }

    public void panel(){
        panel.setSize(400, 300);
        panel.setResizable(false);
        panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(hor, ver));

        for (int i = 0; i < hor; i++) {
            for (int j = 0; j < ver; j++) {
                buttons[i][j] = new FieldButton(i,j);
                panel.add(buttons[i][j]);
            }
        }
        for (int i = 0; i < bom; i++){
            int x = (int) (Math.random() * hor);
            int y = (int) (Math.random() * ver);
            while (buttons[x][y].getType() == "bomb"){
                x = (int) (Math.random() * hor);
                y = (int) (Math.random() * ver);
            }
            buttons[x][y].setType("bomb");
            buttons[x][y].reveal();
        }

        for (int i = 0; i < ver; i ++){
            for (int j = 0; j < hor; j++){
                //String x = checkField()
                if (buttons[j][i].getType() != "bomb") {//ik maak hier een extra functie voor zodat ik gewoon "0" kan gebruiken, stomme workarounds...
                    String bombs = typeDeclare(checkField(j, i).size());
                    //System.out.println(bombs);
                    buttons[j][i].setType(bombs);
                    buttons[j][i].reveal();
                }
            }
        }




        panel.setVisible(true);
    }

    public ArrayList checkField(int x, int y){//TODO Verander in return arraylist, voor hoeveel bommen, gebruik arrayList.size, voor hoeveel nullen, voeg arraylist samen
//        if (buttons[x][y].getType() == "bomb")
//            return "bomb";
//        else {
            ArrayList<FieldButton> bombs = new ArrayList<>();
            ArrayList<FieldButton> emptyField = new ArrayList<>();
            int i = 0;
            int xmin = -1;
            int xmax = 1;
            int ymin = -1;
            int ymax = 1;

            if(x == 0){
                xmin = 0;
            }else if(x == hor - 1){
                xmax = 0;
            }
            if(y == 0){
                ymin = 0;
            }else if(y == ver - 1){
                ymax = 0;
            }
            for (int q = ymin; q <= ymax; q ++){
                for (int z = xmin; z <= xmax; z++){
                    if (buttons[x+z][y+q].getType() == "bomb") {
                        i++;
                        bombs.add(buttons[x + z][y + q]);
                    }
                }
            }
            if (i == 0) {// omweg, zie FieldButton setType
//                return "0";// "" + 0  lijkt niet te werken als "0"
                return bombs;
            }
            else {
//                return "" + i;
                return bombs;
            }
//        }
    }

    public void openArea(int x, int y){
        System.out.println("hello!");
        ArrayList<String> checked = new ArrayList<String>();
        ArrayList<String> check = new ArrayList<String>();
        check.add("" + x + "," + y);
        //System.out.println("yoho" + check.size());
        /*while (check.size() != 0){
            if ()
        }*/
    }

    private String typeDeclare(int x){
       String returner = "";// waarom werkt dit wel zo maar niet meteen directe return?
        switch(x){
            case 0: returner = "0"; break;
            case 1: returner = "1"; break;
            case 2: returner = "2"; break;
            case 3: returner = "3"; break;
            case 4: returner = "4"; break;
            case 5: returner = "5"; break;
            case 6: returner = "6"; break;
            case 7: returner = "7"; break;
            case 8: returner = "8"; break;
            default: returner = "snap nie";
        }
        return returner;

    }

}
