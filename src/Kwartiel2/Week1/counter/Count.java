package Kwartiel2.Week1.counter;

/**
 * Created by Roderik on 18-11-15.
 */
public class Count {
    private int value;

    public void addCount(){
        value++;
    }
    public void undoCount(){
        if (value > 0){
            value--;
        }
    }
    public void resetCount(){
        value = 0;
    }
    public int getValue(){
        return value;
    }
}

