//package com.wibaek.week5;

import java.util.ArrayList;
import java.util.List;

public class Lab05_2 {
    public static void main(String[] args) {
        S22_2 s22 = new S22_2("S22", 2022);
        MP3_2 mp3 = new MP3_2("MP3", 2005);
        TV_2 tv = new TV_2("TV", 2017);

        Device_2[] devices = new Device_2[] { s22, mp3, tv };

        for (Device_2 device : devices) {
            printInfor(device);
        }
    }

    private static void printInfor(Device_2 device) {
        System.out.println(device.getInFor());
    }
}

class Device_2 {
    private String name;
    private int year;

    Device_2(String name, int year) {
        this.name = name; this.year = year;
    }

    public String getInFor() {
        return name + " " + year;
    }
}

class S22_2 extends Device_2 {
    private static final int price = 1400;
    S22_2(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInFor() {
        return super.getInFor() + " " + "$" + price;
    }
}

class MP3_2 extends Device_2 {
    private static final int price = 120;
    MP3_2(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInFor() {
        return super.getInFor() + " " + "$" + price;
    }
}

class TV_2 extends Device_2 {
    private static final int price = 5000;
    TV_2(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInFor() {
        return super.getInFor() + " " + "$" + price;
    }
}
