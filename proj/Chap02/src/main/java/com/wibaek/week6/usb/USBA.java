package com.wibaek.week6.usb;

public interface USBA extends USB {
    @Override
    default void readUSB() {
        System.out.println("USB read");
    }
    default void connectA() {
        System.out.println("USB-A connected");
    }
}
