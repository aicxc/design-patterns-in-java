package com.aicxc.abstractfactory.singleton;

/**
 * 饿汉模式，线程安全
 */
public class SingletonEH {

    private static final SingletonEH instance = new SingletonEH();

    private SingletonEH() {

    }

    public static SingletonEH getInstance() {
        return instance;
    }
}
