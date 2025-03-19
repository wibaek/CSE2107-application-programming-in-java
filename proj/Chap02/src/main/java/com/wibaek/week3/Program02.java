package com.wibaek.week3;

import java.util.Arrays;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 5 positive numbers: ");

        int[] intArray = new int[5];
        int sum = 0;

        for (int i=0; i<intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }

        System.out.println("Average: " + sum / Double.valueOf(intArray.length));
    }
}
