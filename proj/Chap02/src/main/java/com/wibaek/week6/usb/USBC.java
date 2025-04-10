package com.wibaek.week6.usb;

public interface USBC extends USB {
    @Override
    default void readUSB() {
        System.out.println("USB read");
    }
    default void writeUSB() {
        System.out.println("USB write");
    }
    default void connectC() {
        System.out.println("USB-C connected");
    }
}
