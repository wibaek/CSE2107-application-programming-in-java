package com.wibaek.week3;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 5 positive numbers: ");

        int biggest = -1;
        for (int i=0; i<5; i++) {
            int inp = scanner.nextInt();
            if (inp > biggest) {
                biggest = inp;
            }
        }

        System.out.println("Maximum number: " + biggest);
    }
}
