package com.wibaek.week6.hub;

import com.wibaek.week6.usb.USB;
import com.wibaek.week6.usb.USBA;
import com.wibaek.week6.usb.USBC;

public class USBhub {
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
