package com.wibaek.week9;

import java.io.*;
import java.util.Scanner;

public class Lab09_2 {

    static final String FILE_PATH = "c:/test/test3.txt";
//        static final String FILE_PATH = "/Users/wibaek/test2.txt";

    public static void main(String[] args) {
        FileOutputStream fout = null;
        OutputStreamWriter out = null;

        FileInputStream fin = null;
        InputStreamReader in = null;

        Scanner s = new Scanner(System.in);

        try {
            fout = new FileOutputStream(FILE_PATH);
            out = new OutputStreamWriter(fout, "UTF-8");

            while(true) {
                String line = s.nextLine();
                if(line.length() == 0) {
                    break;
                }
                out.write(line, 0, line.length());
                out.write("\n", 0, 1);
            }

            out.close();
            fout.close();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        try {
            fin = new FileInputStream(FILE_PATH);
            in = new InputStreamReader(fin, "UTF-8");
            char c[] = new char[10];
            int num;
            while((num = in.read(c)) != -1) {
                for(int i = 0; i < num; i++) {
                    System.out.print(c[i]);
                }
            }

            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        s.close();
    }
}
