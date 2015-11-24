package Kwartiel2.Week2.Car;

/**
 * Created by Roderik on 24-11-15.
 */
public class Car {
    private double tankSize;
    private int distancePerLiter;
    private double fuelLevel;
    private double driveDistance;

    public Car(double tankSize, int distancePerLiter){
        this.distancePerLiter = distancePerLiter;
        this.tankSize = tankSize;
    }

    public void setDriveDistance(int driveDistance) {
        this.driveDistance = driveDistance;
    }

    public double getCurrentFuelLevel(Car fuelCount){
        this.fuelLevel = fuelCount.tankSize;
        this.fuelLevel = this.fuelLevel - (driveDistance/distancePerLiter);
        fuelCount.tankSize = this.fuelLevel;
        return this.fuelLevel;
    }

}
