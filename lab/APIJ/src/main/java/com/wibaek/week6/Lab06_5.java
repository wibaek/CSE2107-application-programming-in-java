package com.wibaek.week6;

import java.util.Scanner;

public class Lab06_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Bart, don't make fun of grad students. They just made a terrible life choice...
        System.out.print("Input a string: ");
        input = scanner.nextLine();

        int inputLength = input.length();
        // random number from 0 to inputLength - 1
        int startIndex = (int)(Math.random() * inputLength);
//        startIndex = 15;
//        startIndex = 25;

        String slicedInput = input.substring(startIndex);

        System.out.println("startIndex = " + startIndex + ", #words = " + countWords(slicedInput));
        System.out.println(slicedInput);
    }

    public static int countWords(String str) {
        String[] splitedStr = str.split(" ");
        int count = splitedStr.length;

        // remove empty string
        for (String s: splitedStr) {
            if (s.equals("")) {
                count--;
            }
        }

        return count;
    }
}
