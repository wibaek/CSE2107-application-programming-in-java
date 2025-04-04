package com.wibaek.week5;

public class Lab05_4 {
    public static void main(String[] args) {

    }

    public void readUSB(USB_4 usb) {
        System.out.print(usb.getName() + ": ");
        usb.readUSB();
    }
    public void writeUSB(USB_4 usb) {
        usb.writeUSB();
    }
    public void connectUSB(USBA_4 usb) {
        if(usb instanceof USBA_4) {
            ((USBA_4) usb).connectA();
        }
    }
}

interface USB_4 {
    void readUSB();
    default void writeUSB() {
        System.out.println("Can't write to USB");
    }
}

interface USBA_4 extends USB_4 {
    @Override
    default void readUSB() {
        System.out.println("USB read");
    }
    default void connectA() {
        System.out.println("USB-A connected");
    }
}

interface USBC_4 extends USB_4 {
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

class S22_4 implements USBC_4 {
    private String name;

    S22_4(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class MP3 implements USBA_4 {
    private String name;

    MP3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}