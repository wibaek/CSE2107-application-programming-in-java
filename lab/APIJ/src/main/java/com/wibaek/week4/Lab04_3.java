//package com.wibaek.week4;

import java.util.Scanner;

public class Lab04_3 {
    static Scanner scan = new Scanner(System.in);
    static void closeSacnner() {
        scan.close();
    }
    public static void main(String[] args) {
        int number;
        System.out.print("Enter #students: ");
        number = scan.nextInt();
        Student2[] sArr = makeArray(number);
        System.out.println();
        printArray(sArr);
        Lab04_3.closeSacnner();
    }

    public static Student2[] makeArray(int number) {
        Student2[] sArr = new Student2[number];

        for(int i=0; i<number; i++) {
            System.out.print("Enter your name and birth: ");
            String name = scan.next();
            int birth = scan.nextInt();
            sArr[i] = new Student2(name, birth);
        }

        return sArr;
    }

    public static void printArray(Student2[] sArr) {
        for(Student2 s: sArr) {
            s.printInFor();
        }
    }
}

class Student2 {
    private String name;
    private int birth;

    Student2(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }

    public void printInFor() {
        System.out.println(name + " " + birth);
    }
}
