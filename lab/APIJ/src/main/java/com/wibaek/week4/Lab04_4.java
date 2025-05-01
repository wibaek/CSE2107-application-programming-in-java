//package com.wibaek.week4;

public class Lab04_4 {
    public static void main(String[] args) {
        int[] array1 = { 1993, 0, 5, 1, 6 };
        int[] array2 = { 1990, 0, 2, 1, 2 };
        int[] array3;

        array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}

class ArrayUtil {
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;

        for (int value : arr1) {
            arr3[i] = value;
            i++;
        }
        for (int value: arr2) {
            arr3[i] = value;
            i++;
        }

        return arr3;
    }

    public static void print(int[] arr) {
        System.out.print("[ ");
        for (int value: arr) {
            System.out.print(value + " " );
        }
        System.out.print("]");
    }
}
