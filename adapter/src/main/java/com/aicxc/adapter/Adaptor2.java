package com.aicxc.adapter;

/**
 * @author Hyy
 * @version 2019/08/06 9:49
 */
public class Adaptor2 implements Usb {

    private Ps2 ps2;

    public Adaptor2() {

    }

    public Adaptor2(Ps2 ps2) {
        this.ps2 = ps2;
    }

    @Override
    public void describeUsb() {
        ps2.describePs2();
    }
}
