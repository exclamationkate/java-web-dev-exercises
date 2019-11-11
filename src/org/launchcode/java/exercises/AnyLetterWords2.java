package org.launchcode.java.exercises;

import java.util.*;

public class AnyLetterWords2 {

    public static void main(String[] args) {
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String str2 = str.replaceAll(",", "");
        String str3 = str2.replaceAll("\\.", "");
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(str3.split(" ")));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        Integer wordLength = input.nextInt();
        ArrayList<String> newWords = AnyLetterWords.createListOfWords(words, wordLength);
        Integer numWords = newWords.size();

        if (numWords > 0) {
            System.out.println("There are " + numWords + " words in the string with a length of " + wordLength + ", listed below:");
            for (String word : newWords) {
                System.out.println(word);
            }
        } else {
            System.out.println("There are no words in the string with " + wordLength + " letters.");
        }
    }

}
