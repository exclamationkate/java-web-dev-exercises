package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner inputLength;
        Scanner inputWidth;

        inputLength = new Scanner(System.in);
        System.out.println("Enter a length (cm):");
        length = inputLength.nextDouble();

        inputWidth = new Scanner(System.in);
        System.out.println("Enter a width (cm):");
        width = inputWidth.nextDouble();

        area = length * width;
        System.out.println("The area of the rectangle is " + area + "cm^2.");
    }
}
