package com.wibaek.week6.device;

import com.wibaek.week6.usb.USBA;

public class MP3 extends Device implements USBA {
    private static int price = 120;

    public MP3(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInfor() {
        return "MP3 " + getYear() + " " + "$" + price;
    }

    @Override
    public void readUSB() {
        System.out.print("MP3: ");
        USBA.super.readUSB();
    }

    @Override
    public void connectA() {
        System.out.print("MP3: ");
        USBA.super.connectA();
    }
}
