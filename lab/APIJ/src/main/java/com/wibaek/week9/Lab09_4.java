package com.wibaek.week9;

import java.io.*;
import java.util.Scanner;

public class Lab09_4 {

//    static final String FILE_PATH = "c:/test/test3.txt";
        static final String FILE_PATH = "/Users/wibaek/dlwlrma.jpg";

    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        // Check reading time
        // 1. FileInputStream
        TimeChecker timeChecker1 = new TimeChecker();
        timeChecker1.start();

        try {
            fis = new FileInputStream(FILE_PATH);
            int c;
            while((c = fis.read()) != -1) {
            }
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        timeChecker1.end();

        // 2. BufferedInputStream
        TimeChecker timeChecker2 = new TimeChecker();
        timeChecker2.start();

        try {
            bis = new BufferedInputStream(new FileInputStream(FILE_PATH));
            int c;
            while((c = bis.read()) != -1) {
            }
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        timeChecker2.end();

        System.out.println("FileInputStream: " + timeChecker1.getTime() + "ms");
        System.out.println("BufferedInputStream: " + timeChecker2.getTime() + "ms");
    }
}

class TimeChecker{
    private Long timeAfter;
    private Long timeBefore;

    public void start() {
        timeBefore = System.currentTimeMillis();
    }
    public void end() {
        timeAfter = System.currentTimeMillis();
    }
    public Long getTime() {
        if (timeAfter == null || timeBefore == null) {
            return null;
        }
        return timeAfter - timeBefore;
    }
}