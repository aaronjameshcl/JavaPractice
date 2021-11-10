package com.company;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Create scanner to read input
        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence.");
        String text = input.nextLine();
        //Initialize data
        Map<Integer, Integer> words = new HashMap<Integer, Integer>();
        boolean spelling = false;
        int longest = 0;
        int wordCount = 0;
        int wordLength = 0;
        char currChar;
        //loop through the sentence one character at a time
        for (int i = 0; i < text.length(); i++) {
            currChar = text.charAt(i);
            //Check for characters that mean a word has ended
            if(currChar == ' ' || currChar == 9 || currChar == '.' || currChar == ',' || currChar == '!' || currChar == '?') {
                //update data accordingly
                if(spelling) {
                    spelling = false;
                    wordCount++;
                    if(words.get(wordLength) == null) words.put(wordLength, 1);
                    else words.put(wordLength, words.get(wordLength) + 1);
                    if(wordLength > longest) longest = wordLength;
                    wordLength = 0;
                }
                continue;
            }
            //Check for letters to count and update data
            if((currChar >= 'A' && currChar <= 'Z') || (currChar >= 'a' && currChar <= 'z')) {
                spelling = true;
                wordLength++;
                if(wordLength > longest) longest = wordLength;
                if(i == text.length() - 1) {
                    if(words.get(wordLength) == null) words.put(wordLength, 1);
                    else words.put(wordLength, words.get(wordLength) + 1);
                    wordCount++;
                }
            }
        }
        //print results
        System.out.println("There are " + wordCount + " words in your sentence.");
        for(int i = 1; i <= longest; i++) {
            if(words.get(i) == null) continue;
            System.out.println("There are " + words.get(i) + " words with " + i + " letters.");
        }
        input.close();
    }
}
