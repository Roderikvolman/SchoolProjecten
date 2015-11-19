package Kwartiel2.pointer;


/**
 * Created by Roderik on 18-11-15.
 */
public class Main {

    public static void main(String[] args) {

        Point pointA = new Point(-3, -3, "a");
        System.out.println(pointA.getName() + " " + pointA.getX() + " " + pointA.getY());
        System.out.println(pointA.distanceToOrigin());

        Point pointB = new Point(-1, -1, "b");
        System.out.println(pointB.distanceToPoint(pointA));

    }

}
