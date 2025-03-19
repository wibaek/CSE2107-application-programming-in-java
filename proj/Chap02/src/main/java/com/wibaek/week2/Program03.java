//package com.wibaek.week2;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coordinates of a point (x, y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (100 <= x && x <= 200 && 100 <= y && y <= 200) {
            System.out.println("(" + x + ", " + y + "): inside the rectangle");
        } else {
            System.out.println("(" + x + ", " + y + "): not in the rectangle");
        }
    }
}
