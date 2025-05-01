package com.wibaek.week3;

import java.util.Scanner;

public class Lab03_5 {
    public static void main(String[] args) {
        int[][] arr = makeArray();

        // Output
        for(int[] a : arr) {
            System.out.println();
            for(int i: a) {
                System.out.print(i + " ");
            }
        }
        
    }

    private static int[][] makeArray() {
        Scanner scanner = new Scanner(System.in);

        int [][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[1];
        arr[2] = new int[4];

        System.out.println("Enter 8 integers");
        for(int[] a: arr) {
            for (int i=0; i<a.length; i++) {
                a[i] = scanner.nextInt();
            }
        }

        return arr;
    }
}
