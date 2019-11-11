package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Collections;

public class FiveLetterWords {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "breakfast", "lunch", "dinner", "snack", "dessert");

        System.out.println(createListOfFiveLetterWords(words));

    }

    private static ArrayList<String> createListOfFiveLetterWords(ArrayList<String> words) {
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == 5) {
                fiveLetterWords.add(word);
            }
        }
        return fiveLetterWords;
    }
}
