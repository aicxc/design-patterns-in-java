package com.aicxc.abstractfactory;

/**
 * @author Hyy
 * @version 2019/07/30 10:27
 */
public class HuaWeiPhone implements IPhone {
    @Override
    public void turnOn() {
        System.out.println("华为手机开机啦~");
    }

    @Override
    public void turnOff() {
        System.out.println("华为手机关机啦~");
    }

    @Override
    public void use() {
        System.out.println("华为手机使用啦~");
    }
}
