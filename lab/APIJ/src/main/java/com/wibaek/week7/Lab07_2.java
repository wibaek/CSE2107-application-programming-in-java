package com.wibaek.week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab07_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> names = new ArrayList<String>();

        while (true) {
            System.out.print("? ");
            String name = s.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            names.add(name);
        }

        String longestName = names.get(0);

        for(String str: names) {
            if (str.length() > longestName.length()) {
                longestName = str;
            }
            System.out.print(str + " ");
        }

        System.out.println();
        System.out.println("the longest name: " + longestName);

    }
}
