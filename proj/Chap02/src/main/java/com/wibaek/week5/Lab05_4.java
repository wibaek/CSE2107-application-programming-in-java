//package com.wibaek.week5;

public class Lab05_4 {
    public static void main(String[] args) {
        S22_4 s22 = new S22_4("S22");
        MP3_4 mp3 = new MP3_4("MP3");

        USB_4[] hub = new USB_4[] {s22, mp3};
        for (USB_4 u : hub) {
            connect(u);
            readUSB(u);
            writeUSB(u);
        }
    }

    public static void readUSB(USB_4 usb) {
        usb.readUSB();
    }

    public static void writeUSB(USB_4 usb) {
        usb.writeUSB();
    }

    public static void connect(USB_4 usb) {
        if(usb instanceof USBA_4) {
            ((USBA_4) usb).connectA();
        }
        if(usb instanceof USBC_4) {
            ((USBC_4) usb).connectC();
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

    @Override
    public void readUSB() {
        System.out.print("S22: ");
        USBC_4.super.readUSB();
    }

    @Override
    public void writeUSB() {
        System.out.print("S22: ");
        USBC_4.super.writeUSB();
    }

    @Override
    public void connectC() {
        System.out.print("S22: ");
        USBC_4.super.connectC();
    }
}

class MP3_4 implements USBA_4 {
    private String name;

    MP3_4(String name) {
        this.name = name;
    }

    @Override
    public void readUSB() {
        System.out.print("MP3: ");
        USBA_4.super.readUSB();
    }

    @Override
    public void connectA() {
        System.out.print("MP3: ");
        USBA_4.super.connectA();
    }
}
