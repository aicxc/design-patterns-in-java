package com.aicxc.abstractfactory;

/**
 * @author Hyy
 * @version 2019/07/30 10:24
 */
public class XiaoMiRouter implements IRouter {
    @Override
    public void turnOn() {
        System.out.println("小米路由开机啦~");
    }

    @Override
    public void turnOff() {
        System.out.println("小米路由关机啦~");
    }

    @Override
    public void use() {
        System.out.println("小米路由使用啦~");
    }
}
