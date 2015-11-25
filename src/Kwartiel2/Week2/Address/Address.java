package Kwartiel2.Week2.Address;


import java.util.ArrayList;

/**
 * Created by Roderik on 24-11-15.
 */
public class Address {

    private int housenumber;
    private String street;
    private int appartmentNumber; //optional
    private String city;
    private String state;
    private int postalCode; //Only numbers in american postal code.

    public Address(int houseNumber, String street, String city, String state, int postalCode) {
        this.housenumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public Address(int houseNumber, String street, String city, String state, int postalCode, int appartmentNumber) {
        this(houseNumber,street,city,state,postalCode);
        this.appartmentNumber =appartmentNumber;
    }


}