package org.example;

import java.util.Scanner;

public class Area{
    static double radius;
    final double PI = 3.14159;

    public Area(double radius){
        this.radius = radius;
    }

    public double getRadius(double radius){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){

        return PI*radius*radius;
    }
}




//    private double r = 10.0;
//
//    double circleArea = Math.PI * (r * r);

