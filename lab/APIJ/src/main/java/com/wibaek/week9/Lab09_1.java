package com.wibaek.week9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab09_1 {

    static final String FILE_PATH = "c:/test/test2.txt";
//    static final String FILE_PATH = "/Users/wibaek/test2.txt";
//
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;

        Scanner s = new Scanner(System.in);

        try {
            fw = new FileWriter(FILE_PATH);

            while(true) {
                String line = s.nextLine();
                if(line.length() == 0) {
                    break;
                }
                fw.write(line, 0, line.length());
                fw.write("\n", 0, 1);
            }

            fw.close();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        try {
            fr = new FileReader(FILE_PATH);
            int c;
            while((c = fr.read()) != -1) {
                System.out.print((char) c);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        s.close();
    }
}
