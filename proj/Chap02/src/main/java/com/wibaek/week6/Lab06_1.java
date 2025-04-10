package com.wibaek.week6;

import com.wibaek.week6.device.Device;
import com.wibaek.week6.device.MP3;
import com.wibaek.week6.device.S22;
import com.wibaek.week6.device.TV;
import com.wibaek.week6.hub.USBhub;
import com.wibaek.week6.usb.USB;

public class Lab06_1 {
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
