package Kwartiel2.Week1.cashRegister;

/**
 * Created by Roderik on 18-11-15.
 */
public class Main {

    public static void main(String[] args) {

        CashRegister reg1 = new CashRegister();
        System.out.println(reg1.getValue());
        reg1.addItem(3.25);
        reg1.addItem(1.95);
        System.out.println(reg1.getValue());

    }
}
