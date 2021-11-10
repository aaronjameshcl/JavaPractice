package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static boolean areAnagrams(char[] c1, char[] c2){
        //check that the char arrays are of the same length
        if(c1.length != c2.length) return false;
        //sort the char arrays
        Arrays.sort(c1);
        Arrays.sort(c2);
        //check for any differences in the arrays
        for(int i = 0; i < c1.length; i++) {
            //if there is a difference, return false
            if(c1[i] != c2[i]) return false;
        }
        //if the whole array is checked and there are no differences, return true
        return true;
    }

    public static void main(String[] args) {
        //get two strings to compare
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string.");
        String s1 = input.nextLine();
        System.out.println("Enter the second string.");
        String s2 = input.nextLine();
        //convert from string to char arrays
        char c1[] = new char[s1.length()];
        for(int i = 0; i < s1.length(); i++) {
            c1[i] = s1.charAt(i);
        }
        char c2[] = new char[s2.length()];
        for(int i = 0; i < s2.length(); i++) {
            c2[i] = s2.charAt(i);
        }
        //pass to function and respond accordingly
        if(areAnagrams(c1,c2)) System.out.println("The two strings are anagrams.");
        else System.out.println("The two strings are not anagrams.");
        input.close();
    }
}
