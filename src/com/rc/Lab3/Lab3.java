package com.rc.Lab3;

public class Lab3 {
    public static void main(String[] args) {
        String text = " This is it. I am done! hello my name. is you hello.";
        System.out.println("Words = " + Counter.getGetNrOfWords(text));
        System.out.println("Letters = " + Counter.getNrOfLetters(text));
        System.out.println("Sentences = " + Counter.getNrOfSentences(text));
        System.out.println("Vowels = " + Counter.getNrOfVowels(text));
        System.out.println("Consonants = " + Counter.getNrOfConsonants(text));
        Counter.getLongestWord(text);
        Counter.getTopWords(text); // not done

    }
}



