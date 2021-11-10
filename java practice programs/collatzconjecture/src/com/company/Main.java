package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a starting number.");
        int value = Integer.parseInt(input.nextLine());
        int start = value;
        int steps = 0;
        int max = value;
        while (value != 1) {
            //multiply by 3 and add 1 if odd and divide by two if even
            value = value % 2 == 1? (value*3)+1:value/2;
            max = value > max? value:max;
            steps++;
        }
        System.out.println("Your starting value of " + start + " reached the value of 1 in " + steps + " steps.");
        System.out.println("The highest value it reached was " + max + ".");
        input.close();
    }
}
