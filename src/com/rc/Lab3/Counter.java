package com.rc.Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Counter {

    public static String vowelsList = "aeiouAEIOU";
    public static String consonantsList = "bcdfgjklmnpqstvxzhrwyBCDFGJKLMNPQSTVXZHRWY";

    static int getNrOfLetters(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int letterCount = 0;
        int endOfLine = text.length() - 1;
        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                letterCount++;
            }
        }
        return letterCount;
    }

    static int getGetNrOfWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = text.length() - 1;
        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            // if the char is a letter, word = true.
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }

        return wordCount;
    }

    static int getNrOfSentences(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int sentenceCount = 0;
        //List<Character> punctuation = Arrays.asList('?', '.', '!');
        for (int i = 0; i < text.length(); i++) {
            //checks whether given character is a punctuation mark
            if (text.charAt(i) == '?' || text.charAt(i) == '.' || text.charAt(i) == '!') {
                sentenceCount++;
            }
        }
        return sentenceCount;
    }

    static int getNrOfVowels(String text) {
        int vowelsCount = 0;
        // List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> vowels = new ArrayList<Character>();
        for (char c : vowelsList.toCharArray()) {
            vowels.add(c);
        }

        for (int i = 0; i < text.length(); i++) {
            if (vowels.contains(text.charAt(i))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    static int getNrOfConsonants(String text) {
        int consonantsCount = 0;
        List<Character> consonants = new ArrayList<Character>();
        for (char c : consonantsList.toCharArray()) {
            consonants.add(c);
        }

        for (int i = 0; i < text.length(); i++) {
            if (consonants.contains(text.charAt(i))) {
                consonantsCount++;
            }
        }
        return consonantsCount;
    }

    static void getLongestWord(String text) {
        String[] word = text.split(" ");
        String longword = null;
        for (int i = 0; i < word.length; i++) {
            for (int j = 1 + i; j < word.length; j++) {
                if (word[i].length() >= word[j].length()) {
                    longword = word[i];
                    break;
                }
            }
        }
        assert longword != null;
        System.out.println("The longest word is " + longword + " with "+ longword.length() + " characters.");
    }

    static void getTopWords(String text) {
        int finalCount = 0;
        int tempCount;
        String mostlyUsedWord = null;

        for (String word: text.split(" ")){
            tempCount = 0;
            for (String w: text.split(" ")) {
                if (word.equalsIgnoreCase(w)) {
                    tempCount++;
                }
            }
            if (tempCount >= finalCount) {
                finalCount = tempCount;
                mostlyUsedWord = word;
            }
        }
        System.out.println("Most frequent word is " + mostlyUsedWord + " , times = " + finalCount);
    }

}

