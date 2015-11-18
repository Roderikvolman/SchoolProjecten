package Kwartiel2.pointer;


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
        //@Jaimy deze is nog niet goed
        double distanceA =  Math.sqrt((y*y)+(x*x));
        double distanceB = Math.sqrt((other.getY()*other.getY()) + (other.getX()*other.getX()));
        double distance = distanceA + distanceB;
        return distance;
    }
}

