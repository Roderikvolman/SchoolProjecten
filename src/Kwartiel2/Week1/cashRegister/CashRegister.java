package Kwartiel2.Week1.cashRegister;

/**
 * Created by Roderik on 18-11-15.
 */
public class CashRegister {

    private double value;

    public void addItem(double amount) {
        value += amount;
    }
    public double getValue(){
        return value;
    }

}