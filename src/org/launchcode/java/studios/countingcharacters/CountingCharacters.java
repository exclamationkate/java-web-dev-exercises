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

}
