package com.company;

import java.awt.*;

public class Point {

    private int xVector;
    private int yVector;
    private static int points = 0;

    // Method to construct an object without parameters.
    public Point(){
        xVector = 0;
        yVector = 0;
        points ++;
    }

    // Method to construct an object with integer values.
    public Point(int xVector, int yVector){
        this.xVector = xVector;
        this.yVector = yVector;
        points ++;
    }

    // Method to construct an object wit double values.
    public Point(double xVector, double yVector){
        this.xVector = (int) xVector;
        this.yVector = (int) yVector;
        points ++;
    }

    // Method to construct an object with other object.
   public Point(Point obj){
        this.xVector = obj.obtainXVector();
        this.yVector = obj.obtainYVector();
        points ++;
   }

   // Method that give value to Y vector.
    public int obtainYVector() {
        return yVector;
    }

    // Method that give value to X vector.
    public int obtainXVector() {
        return xVector;
    }

    // Method to change the value of X vector.
    public void changeXVector(int xVector){
        this.xVector = xVector; // Use this. cause xVector is a parameter and a variable of an instance.
    }

    // Method to change the value of Y vector.
    public void changeYVector(int yVector){
        this.yVector = yVector; // Use this. cause yVector is a parameter and a variable of an instance.
    }

    // Method to draw a point.
    public void drawPoint (Graphics graphics){
        graphics.fillOval(xVector,yVector, 5, 5);
    }

    // Method to obtain a Point object in String format.
    public String toString(){
        return "(" + obtainXVector() + "," + obtainYVector() + ")";
    }

    // Method to access to created objects.
    public static int getPoints(){
        return points;
    }
}
