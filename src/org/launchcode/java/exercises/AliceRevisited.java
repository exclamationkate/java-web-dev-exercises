package org.launchcode.java.exercises;

import java.util.Scanner;

public class AliceRevisited {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and " +
                "what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        String searchTerm;
        String newSentence;

        Scanner inputSearchTerm = new Scanner(System.in);
        System.out.println("Please enter a search term:");
        searchTerm = inputSearchTerm.nextLine().toLowerCase();

        if (sentence.toLowerCase().contains(searchTerm)) {
            System.out.println("'" + searchTerm + "' is located at index " + sentence.indexOf(searchTerm) + " out of " + sentence.length() + ".");
            String tempWord = searchTerm + " ";
            newSentence = sentence.replaceAll(tempWord, "");
            System.out.println(newSentence);
        } else {
            System.out.println("Word is not contained in sentence.");
        }
    }
}
