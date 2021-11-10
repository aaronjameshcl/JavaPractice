package com.company;

import java.util.Scanner;

public class Main {

    public static void showEveryFifth(int[] nums) {
        int index = 4;
        while(true) {
            try{
                System.out.println(nums[index]);
            }
            catch(Exception e){
                System.out.println("Out of bounds exception trying to print the element at index " + index + ".");
                break;
            }
            index += 5;
        }
    }

    public static int[] newArray(int size, int[] old, int next) {
        int newArr[] = new int[size + 1];
        for(int i = 0; i < size; i++){
            newArr[i] = old[i];
        }
        newArr[size] = next;
        return newArr;
    }

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("Enter a series of positive numbers and enter 0 to stop.");
        int size = 0;
        int arr[] = {0};
        int nextNum = Integer.parseInt(input.nextLine());
        while(nextNum > 0 && nextNum != 0) {
            arr = newArray(size, arr, nextNum);
            size++;
            nextNum = Integer.parseInt(input.nextLine());
        }
        showEveryFifth(arr);
    }
}
