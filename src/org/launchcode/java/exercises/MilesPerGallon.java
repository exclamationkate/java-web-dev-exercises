package org.launchcode.java.exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;

        Scanner inputMiles = new Scanner(System.in);
        System.out.println("How many miles have you traveled?");
        miles = inputMiles.nextDouble();

        Scanner inputGallons = new Scanner(System.in);
        System.out.println("How many gallons of gasoline have you used?");
        gallons = inputGallons.nextDouble();

        milesPerGallon = miles / gallons;
        System.out.println("Your vehicle traveled " + milesPerGallon + " miles-per-gallon.");
    }
}
