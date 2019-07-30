package com.aicxc.abstractfactory;

/**
 *
 */
public class XiaoMiPhone implements IPhone {
    @Override
    public void turnOn() {
        System.out.println("小米手机开机啦~");
    }

    @Override
    public void turnOff() {
        System.out.println("小米手机关机啦~");
    }

    @Override
    public void use() {
        System.out.println("小米手机开始使用~");
    }
}
