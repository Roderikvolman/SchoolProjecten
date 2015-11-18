package Kwartiel1.Minesweeper;

import Kwartiel1.Minesweeper.Game.Frame;

/**
 * Created by Rick on 25-9-2015.
 */
public class Main {

    public static void main(String[] args){
        new Main().run();
    }

    public void run(){
        new Frame().initiate(9,9,10);
        new Frame().panel();
    }

}
