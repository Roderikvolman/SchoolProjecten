import jdk.nashorn.internal.ir.WhileNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Roderik on 30-09-15.
 */
public class Merge {
    public static void main(String[] args) {

        new Merge().run();

    }

    public void run() {

        ArrayList<Integer> ArrayListOne = new ArrayList<Integer>();
        ArrayList<Integer> ArrayListTwo = new ArrayList<Integer>();
        ArrayList<Integer> ArrayListThree = new ArrayList<Integer>();

        ArrayListOne.add(1);
        ArrayListOne.add(1);
        ArrayListOne.add(2);
        ArrayListOne.add(4);
        ArrayListOne.add(8);

        ArrayListTwo.add(4);
        ArrayListTwo.add(4);
        ArrayListTwo.add(4);
        ArrayListTwo.add(7);
        ArrayListTwo.add(12);
        ArrayListTwo.add(14);
        ArrayListTwo.add(18);
        ArrayListTwo.add(184);


        int maxone = ArrayListOne.size();
        int maxtwo = ArrayListTwo.size();
        int one = 0;
        int two = 0;

        while(one < maxone && two < maxtwo) {
            if (ArrayListOne.get(one) <= ArrayListTwo.get(two)) {
                ArrayListThree.add(ArrayListOne.get(one));
                one++;
            } else if (ArrayListOne.get(one) > ArrayListTwo.get(two)) {
                ArrayListThree.add(ArrayListTwo.get(two));
                two++;
            }
        }
        if(maxone <= one){
            ArrayListThree.addAll(ArrayListTwo.subList(two, maxtwo));
        } else {
            ArrayListThree.addAll(ArrayListOne.subList(one, maxone));
        }

        System.out.println(ArrayListThree);
    }

}


