package com.company;

public class ApplicationPoint1 {
    private static Point a,b,c,d,e;

    public static void main(String[] args) {
        a = new Point();
        System.out.println("Point a = " + a.toString());
        System.out.println("Created points = " + Point.getPoints());

        b = new Point(1,2);
        c = new Point(3.0, 4.0);
        System.out.println("Point b = " + b.toString());
        System.out.println("Point c = " + c.toString());
        System.out.println("Created points = " + Point.getPoints());

        d = new Point(b);
        e = new Point(c);
        System.out.println("Point d = " + d.toString());
        System.out.println("Point e = " + e.toString());
        System.out.println("Created points = " + Point.getPoints());
    }
}
