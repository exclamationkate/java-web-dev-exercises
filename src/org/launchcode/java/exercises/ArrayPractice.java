package org.launchcode.java.exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        // Loops through the array and print out each value
        for (int number : numbers) {
            System.out.println(number);
        }

        // Loops through the array but only prints the odd numbers
        for (int number : numbers) {
            if (number%2 == 1) {
                System.out.println(number);
            }
        }

        // Divides the string at each space and stores the individual words in an array
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        // Splits the string into sentences
        String[] sentences = str.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
