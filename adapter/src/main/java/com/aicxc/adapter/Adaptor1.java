package com.aicxc.adapter;

/**
 * @author Hyy
 * @version 2019/08/06 9:41
 */
public class Adaptor1 extends UsbImpl implements Ps2 {
    @Override
    public void describePs2() {
        this.describeUsb();
    }
}
