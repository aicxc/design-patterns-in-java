package com.aicxc.abstractfactory;

/**
 * @author Hyy
 * @version 2019/07/30 10:29
 */
public class XiaoMiFactory implements IFactory {
    @Override
    public IPhone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouter createRouter() {
        return new XiaoMiRouter();
    }
}
