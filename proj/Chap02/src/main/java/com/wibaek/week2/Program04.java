//package com.wibaek.week2;

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Center of circle: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.print("Radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Point: ");
        int pointX = scanner.nextInt();
        int pointY = scanner.nextInt();


        if (Math.sqrt(Math.pow(x - pointX, 2) + Math.pow(y - pointY, 2)) <= radius) {
            System.out.println("(" + pointX + ", " + pointY + "): inside the circle");
        } else {
            System.out.println("(" + pointX + ", " + pointY + "): not in the circle.");
        }
    }
}
