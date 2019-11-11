package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnyLetterWords {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "breakfast", "lunch", "dinner", "snack", "dessert");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        Integer wordLength = input.nextInt();
        ArrayList<String> newWords = createListOfWords(words, wordLength);

        System.out.println("List of " + wordLength + " letter words:");
        for (String word : newWords) {
            System.out.println(word);
        }
    }

    public static ArrayList<String> createListOfWords(ArrayList<String> words, Integer wordLength) {
        ArrayList<String> listOfWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == wordLength) {
                listOfWords.add(word);
            }
        }
        return listOfWords;
    }

}
