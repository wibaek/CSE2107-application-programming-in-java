package com.wibaek.week6.device;


import com.wibaek.week6.usb.USBC;

public class S22 extends Device implements USBC {
    private static int price = 1400;

    public S22(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInfor() {
        return "S22 " + getYear() + " " + "$" + price;
    }

    @Override
    public void readUSB() {
        System.out.print("S22: ");
        USBC.super.readUSB();
    }

    @Override
    public void writeUSB() {
        System.out.print("S22: ");
        USBC.super.writeUSB();
    }

    @Override
    public void connectC() {
        System.out.print("S22: ");
        USBC.super.connectC();
    }
}
