package Kwartiel2.Week2.Car;

/**
 * Created by Roderik on 24-11-15.
 */
public class main {
    public static void main(String[] args){
        Car one = new Car(50,50);
        Car two = new Car(100,800);
        one.setDriveDistance(200);
        System.out.println(one.getCurrentFuelLevel(one));

        one.setDriveDistance(200);
        System.out.println(one.getCurrentFuelLevel(one));

        two.setDriveDistance(1000);
        System.out.println(two.getCurrentFuelLevel(two));

        two.setDriveDistance(200);
        System.out.println(two.getCurrentFuelLevel(two));
    }
}
