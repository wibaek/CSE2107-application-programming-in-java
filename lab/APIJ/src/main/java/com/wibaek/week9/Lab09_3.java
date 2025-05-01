package com.wibaek.week9;

import java.io.*;
import java.util.Scanner;

public class Lab09_3 {

        static final String DIRECTORY_PATH = "/Users/wibaek/tmp";

    public static void main(String[] args) {
        BufferedReader br = null;

        File dir = new File(DIRECTORY_PATH);
        if (!dir.exists()) {
            System.out.println("Directory does not exist");
            return;
        }
        if (!dir.isDirectory()) {
            System.out.println("Not a directory");
            return;
        }

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("<" + file.getName() + ">");
                try {
                    br = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file: " + file.getName());
                    e.printStackTrace();
                } finally {
                    System.out.println();
                    try {
                        if (br != null) {
                            br.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}

