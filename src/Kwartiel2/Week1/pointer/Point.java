package Kwartiel2.Week1.pointer;


/**
 * Created by Roderik on 18-11-15.
 */
public class Point {
    private int x;
    private int y;
    private String name;

    public Point(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String getName(){
        return name;
    }

    public double distanceToOrigin(){
        double distance =  Math.sqrt((y*y)+(x*x));
        return distance;
    }

    public double distanceToPoint(Point other){

        double distance = Math.sqrt(((x-other.getX())*(x-other.getX()))+((y-other.getY())*(y-other.getY())));
        return distance;
    }
}



