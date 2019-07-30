package com.aicxc.abstractfactory;

/**
 *
 */
public interface IFactory {

    /**
     * 生产手机
     */
    IPhone createPhone();

    /**
     * 生产路由器
     */
    IRouter createRouter();


}
