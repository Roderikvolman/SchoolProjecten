package Kwartiel2.Week2.Address;

/**
 * Created by Roderik on 24-11-15.
 */
public class Main {
    public static void main(String[] args) {

    Address addressWithNumber = new Address(1,"Deventerweg",true,"Laren","Gelderland",12);
            addressWithNumber.setAppartmentNumber(12);

        System.out.println(addressWithNumber);

    }

}
