package com.wibaek.week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab03_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][3];

        System.out.println("Enter 6 integers one by one.");

        // Input
        for(int i=0; i< arr.length * arr[0].length; i++) {
            int inp;
            while(true) {
             try {
                 System.out.print("> ");
                 inp = scanner.nextInt();
                 break;
             } catch (InputMismatchException e) {
                 System.out.println("Not an integer!");
                 scanner.nextLine(); // flush buffer
             }
            }
            arr[i/arr[0].length][i%arr[0].length] = inp;
        }

        // Output
        for(int[] a : arr) {
            for(int i: a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
