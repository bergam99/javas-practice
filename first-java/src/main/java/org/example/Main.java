package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Area circle = new Area(3.1);

        Scanner scan = new Scanner(System.in);

        System.out.println("demi-diamètre fait combien?:");
        Area.radius = scan.nextInt();

        System.out.println("demi-diamètre : "+ Area.radius);
        System.out.printf("aire : "+ circle.getArea());


    }
}





