package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.*;
import java.net.*;
import java.io.*;

public class CountingCharacters {

    public static void main(String[] args) throws Exception {
        HashMap<Character, Integer> characterCount = new HashMap<>();

        // Ask user for input
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Please write a sentence: ");
        String str = input.nextLine();
         */

        // Retrieve HiddenFigures.txt from local drive
        /*
        String str = "";
        str = new String(Files.readAllBytes(Paths.get("/Users/kate/lc101/java-practice/java-web-dev-exercises/src/org/launchcode/java/studios/countingcharacters/HiddenFigures.txt")));
         */

        // Retrieve HiddenFigures.txt from URL and assign to variable str
        URL url = new URL("https://raw.githubusercontent.com/exclamationkate/java-web-dev-exercises/master/src/org/launchcode/java/studios/countingcharacters/HiddenFigures.txt");
        BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
        String str = read.readLine();

        // Remove non-alphabetic characters from string, change all capital letters to lowercase, and split string into character array
        String newStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] charactersInString = newStr.toCharArray();

        // For each character in the array, if character is already in our HashMap, add 1 to the count. Else add it to the HashMap and start the count at 1.
        for (char character : charactersInString) {
            if (characterCount.containsKey(character)) {
                characterCount.put(character, characterCount.get(character)+1);
            } else {
                characterCount.put(character, 1);
            }
        }

        // For each letter in our characterCount HashMap, print out the letter(key) and the number(value) on each line
        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }

    /* Dave's solution

    public static void main(String[] args) throws Exception {
        // Make a string variable to use
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        // Make our HashMap
        HashMap<Character, Integer> counts = new HashMap<>();

        char[] charactersInString = text.toCharArray();

        // For each character in the string
        for (char c : charactersInString) {
            // If I have seen this character before
            if (counts.containsKey(c)) {
                // Add 1 to the count
                int newCount = counts.get(c)+1;
                counts.put(c, newCount); // If you put a key that already exists, it overwrites the previous key with the new value
            } else { // If I haven't seen this character
                // Add character as key and set value to 1
                counts.put(c, 1);
            }
        }
        // Print out the HashMap
        for (char c : counts.keySet()) {
            System.out.println(c + ": " + counts.get(c));
        }
    }
     */
}
