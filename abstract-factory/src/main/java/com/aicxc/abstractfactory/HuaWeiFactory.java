package com.aicxc.abstractfactory;

/**
 * @author Hyy
 * @version 2019/07/30 10:32
 */
public class HuaWeiFactory implements IFactory {
    @Override
    public IPhone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouter createRouter() {
        return new HuaWeiRouter();
    }
}
