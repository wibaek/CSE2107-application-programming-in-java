package com.wibaek.week6.device;

public class TV extends Device {
    private static int price = 5000;

    public TV(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInfor() {
        return "TV " + getYear() + " " + "$" + price;
    }
}
