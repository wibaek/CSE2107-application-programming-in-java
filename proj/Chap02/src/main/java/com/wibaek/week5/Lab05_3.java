package com.wibaek.week5;

import java.util.Scanner;

public class Lab05_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("size of stack: ");
        int sizeOfStack = sc.nextInt();
        StringStack stack = new StringStack(sizeOfStack);

        while(true) {
            System.out.print("input: ");
            String str = sc.next();

            if(str.equals("exit")) {
                break;
            }

            if(!stack.push(str)) {
                System.out.println("stack is full!");
            }
        }

        System.out.print("pop all strings:");
        while(stack.length() > 0) {
            System.out.print(" " + stack.pop());
        }
    }

}

abstract class Stack {
    public abstract int length();
    public abstract int capacity();
    public abstract String pop();
    public abstract boolean push(String str);
}

class StringStack extends Stack {
    private int tos = 0;
    private final int cap;
    private String arr[];

    StringStack(int cap) {
        this.cap = cap;
        arr = new String[cap];
    }

    @Override
    public int length() {
        return tos;
    }

    @Override
    public int capacity() {
        return cap;
    }

    @Override
    public String pop() {
        if (tos == 0) {
            return null;
        }
        return arr[--tos];
    }

    @Override
    public boolean push(String str) {
        if (tos >= cap) {
            return false;
        }
        arr[tos++] = str;
        return true;
    }
}