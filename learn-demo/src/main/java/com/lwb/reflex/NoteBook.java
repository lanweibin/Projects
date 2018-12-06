package com.lwb.reflex;

public class NoteBook {

    public void run() {
        System.out.println("notebook run ");
    }

    /**
     * 使用USB
     */
    public void useUSB(USB usb){
        if (usb != null){
            usb.open();
            usb.close();
        }
    }
}
