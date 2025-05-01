package com.wibaek.week9;

import java.io.*;
import java.util.Scanner;

public class Lab09_5 {

    static final String FILE_PATH = "/Users/wibaek/dlwlrma.jpg";
    static final String COPY_FILE_PATH = "/Users/wibaek/dlwlrma_copy.jpg";

    public static void main(String[] args) {
        TimeChecker5 tc = new TimeChecker5();
        tc.start();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(FILE_PATH);
            fos = new FileOutputStream(COPY_FILE_PATH);

            byte[] buffer = new byte[1024 * 64];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        tc.end();
        System.out.println(tc.getTime() + " ms");
    }
}

class TimeChecker5 {
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