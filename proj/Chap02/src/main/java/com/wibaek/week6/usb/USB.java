package com.wibaek.week6.usb;

public interface USB {
    void readUSB();
    default void writeUSB() {
        System.out.println("Can't write to USB");
    }
}
