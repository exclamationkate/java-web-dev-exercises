// My solution with do/while

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

/*

// Ryan's solution with try/catch

public class Area {
    public static void main(String[] args) {
        System.out.println("Please enter the radius: ");
        Scanner in = new Scanner(System.in);
        double radius = 0;

        try {
            radius = in.nextDouble();
        } catch (Exception _e) {
            throw new RuntimeException("You must enter a number.");
        }

        while (radius <= 0) {
            System.out.println("Please enter a positive number.");
            radius = in.nextDouble();
        }
        System.out.println(Circle.getArea(radius));
    }
}

// Eric's solution

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean good = false;
        String inRad;
        double rad = 0;
        do {
            System.out.println("Please enter the radius of the circle:");
            inRad = input.nextLine();
            if (!inRad.equals("")) {
                try {
                    rad = Double.parseDouble(inRad);
                    if (rad > 0) {
                        good = true;
                        break;
                    } else {
                        System.out.println("A circle can't have a negative radius!");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a number.");
                }
            }
        } while (!inRad.equals("") || !good);
        input.close();
        double area = Circle.getArea(rad);
        System.out.println("The area of the circle is: " + area);
    }
}

*/