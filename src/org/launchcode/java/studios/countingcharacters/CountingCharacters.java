package org.launchcode.java.studios.countingcharacters;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.*;

public class CountingCharacters {

    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> characterCount = new HashMap<>();

        /* Asks user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Please write a sentence: ");
        String str = input.nextLine();
         */

        // Retrieves HiddenFigures.txt
        String str = "";
        str = new String(Files.readAllBytes(Paths.get("/Users/kate/lc101/java-practice/java-web-dev-exercises/src/org/launchcode/java/studios/countingcharacters/HiddenFigures.txt")));
        String newStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] charactersInString = newStr.toCharArray();

        for (char character : charactersInString) {
            if (characterCount.containsKey(character)) {
                characterCount.put(character, characterCount.get(character)+1);
            } else {
                characterCount.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }
}
