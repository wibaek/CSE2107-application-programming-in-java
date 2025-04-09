package com.wibaek.week5;


abstract class Device {
    private String name;
    private int year;

    Device(String name, int year) {
        this.name = name;
        this.year = year;
    }

    protected String getName() {
        return name;
    }

    protected int getYear() {
        return year;
    }

    public abstract String getInfor();
}

interface USB {
    void readUSB();
    default void writeUSB() {
        System.out.println("Can't write to USB");
    }
}

interface USBA extends USB {
    @Override
    default void readUSB() {
        System.out.println("USB read");
    }
    default void connectA() {
        System.out.println("USB-A connected");
    }
}

interface USBC extends USB {
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


class S22 extends Device implements USBC  {
    private static int price = 1400;

    S22(String name, int year) {
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

class MP3 extends Device implements USBA {
    private static int price = 120;

    MP3(String name, int year) {
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

class TV extends Device {
    private static int price = 5000;

    TV(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInfor() {
        return "TV " + getYear() + " " + "$" + price;
    }
}

class USBhub {
    private USB[] devices = new USB[4];
    private int count = 0;

    public void addDevice(USB device) {
        if (count >= devices.length) {
            return ;
        }
        if (device instanceof USBA) {
            ((USBA) device).connectA();
        } else if (device instanceof USBC) {
            ((USBC) device).connectC();
        }
        devices[count] = device;
        count++;
    }

    public void readUSBs() {
        for (int i = 0; i < count; i++) {
            devices[i].readUSB();
        }
    }

    public void writeUSBs() {
        for (int i = 0; i < count; i++) {
            devices[i].writeUSB();
        }
    }
}

public class Lab05_5 {
    public static void main(String[] args) {
        S22 s22 = new S22("S22", 2022);
        MP3 mp3 = new MP3("MP3", 2005);
        TV tv = new TV("TV", 2017);

        Device[] devices = new Device[] {s22, mp3, tv};
        USBhub hub = new USBhub();

        for (Device d : devices) {
            printInfor(d);
            if (d instanceof USB)
                hub.addDevice((USB) d);
        }

        System.out.println();
        hub.readUSBs();
        System.out.println();
        hub.writeUSBs();
    }

    public static void printInfor(Device d) {
        System.out.println(d.getInfor());
    }
}
