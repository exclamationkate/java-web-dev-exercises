package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Collections;

public class SumEvenNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 14, 9, 21, 32, 9, 2, 11, 8, 3, 12);

        System.out.println(sumEvenNumbers(numbers));
    }

    public static int sumEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (number%2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

}
