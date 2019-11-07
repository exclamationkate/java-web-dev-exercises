package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        boolean finished = false;

        Scanner inputRadius = new Scanner(System.in);

        do {
            System.out.println("Enter a radius: ");
            if (inputRadius.hasNextDouble()) {
                radius = inputRadius.nextDouble();
                if (radius > 0) {
                    area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                    finished = true;
                }
            } else {
                System.out.println("Input is not a number.");
                finished = true;
            }
        }
        while (!finished);

    }
}
