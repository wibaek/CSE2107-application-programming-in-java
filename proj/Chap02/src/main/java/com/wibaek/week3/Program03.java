package com.wibaek.week3;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your message.");
        System.out.println("q: quit the program.");

        while(true) {
            System.out.print("> ");
            String msg = scanner.nextLine();
            System.out.println(msg);

            if(msg.equals("q")) {
                break;
            }
        }

        System.out.println("\nBye!");
    }
}
