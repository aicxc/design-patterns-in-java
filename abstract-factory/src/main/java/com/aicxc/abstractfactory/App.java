package com.aicxc.abstractfactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        IFactory xmFactory = new XiaoMiFactory();
        IPhone phone = xmFactory.createPhone();
        IRouter router = xmFactory.createRouter();
        call(phone, router);

        System.out.println("------------------");

        IFactory hwFactory = new HuaWeiFactory();
        phone = hwFactory.createPhone();
        router = hwFactory.createRouter();
        call(phone, router);
    }

    private static void call(IPhone phone, IRouter router) {
        phone.turnOn();
        phone.use();
        phone.turnOff();
        router.turnOn();
        router.use();
        router.turnOff();
    }
}
