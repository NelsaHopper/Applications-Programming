// File:	MyPoint.java
// Project:	Assignments
// Assignment:	#15 -- Part 1
// Programmer:	Mr. Rich Brozovic
// Modified by: NELSA HOPPER
// Date:	11/15/2022
// University:	McMurry University
// Course:	COIS-2350 Fall 2022
// Instructor:	Mr. Brozovic
// Compiler:	Apache Netbeans IDE for Java Developers
// Description: Cartesian MyPoint class for OOP

public class MyPoint {

    private double x;
    private double y;

    public MyPoint() {
        x = 0.0;
        y = 0.0;
    }

    public MyPoint(double px, double py) {
        x = px;
        y = py;
    }

    public MyPoint(MyPoint P) {
        this.x = P.x;
        this.y = P.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "( " + x + ", " + y + " )";
    }

    public void setX(double px) {
        x = px;
    }

    public void setY(double py) {
        y = py;
    }

    public void setPoint(double px, double py) {
        x = px;
        y = py;
    }

    //  ================================================================
    //    WARNING -- WARNING -- WARNING -- WARNING -- WARNING -- WARNING
    //
    //    Got your attention yet?  Read on ...
    //
    //    Do NOT--NOT--NOT--NOT  change any of the above code or
    //                           any of the following method headers!!
    //
    //    Do NOT--NOT--NOT--NOT  add any new code above or
    //                           any new methods below!!
    //
    //    WARNING -- WARNING -- WARNING -- WARNING -- WARNING -- WARNING
    //  ================================================================
    public void moveX(double xval) {
        x = x + (xval);
    }

    public void moveY(double yval) {
        y = y + (yval);
    }

    public void movePoint(double xval, double yval) {
        x = x + (xval);
        y = y + (yval);
    }

    public MyPoint reflect() {
        MyPoint reflect = new MyPoint(x,y);
        x = -x;
        y = -y;
        return reflect(x , y);
    }

    public double distance(MyPoint P) {
        double d = Math.sqrt(((x - x) * (x - x)) + ((y - y) * (y - y)));
        return d;
    }

    public MyPoint midPoint(MyPoint P) {
        MyPoint mid = new MyPoint(x,y);
        x = (x + x) / 2;
        y = (y + y) / 2;
        return mid(x , y);
    }

}
