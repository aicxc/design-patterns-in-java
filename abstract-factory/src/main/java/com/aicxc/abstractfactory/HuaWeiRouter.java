package com.aicxc.abstractfactory;

/**
 * @author Hyy
 * @version 2019/07/30 10:28
 */
public class HuaWeiRouter implements IRouter {
    @Override
    public void turnOn() {
        System.out.println("华为路由开机啦~");
    }

    @Override
    public void turnOff() {
        System.out.println("华为路由关机啦~");
    }

    @Override
    public void use() {
        System.out.println("华为路由使用啦~");
    }
}
