package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Collections;

public class SumArrayLists {

    public static void main(String[] args) { // Method that is the starting point of any Java program.
        // Make two arraylists of integers
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        // Put some stuff into arraylists
        Collections.addAll(a, 3, 4, 5, 1);
        Collections.addAll(b, 1, 6);

        // Make a new arraylist for the result
        ArrayList<Integer> result = new ArrayList<>();

        // Find length of longest list
        int length = 0;
        length = Math.max(a.size(), b.size());

        // For each value in the longest list
        for (int i=0; i < length; i++) {
            // Add value from long list to value from short list
            int valueA = 0;
            int valueB = 0;
            if (i < a.size()) {
                valueA = a.get(i);
            }
            if (i < b.size()) {
                valueB = b.get(i);
            }
            int sum = valueA + valueB;
            // Put that value in the result list
            result.add(sum);
        }

        // Print out the results
        System.out.println(result);

    }
}
