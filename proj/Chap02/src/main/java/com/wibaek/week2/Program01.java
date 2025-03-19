//package com.wibaek.week2;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Flush buffer

        System.out.print("name: ");
        String name = scanner.nextLine();

        System.out.println(age + " " + name);
    }
}
