package com.aicxc.singleton;

/**
 * 懒汉模式
 */
public class SingletonLH {

    private SingletonLH instance;

    private SingletonLH() {

    }

    /**
     * 1、线程不安全
     */
    public SingletonLH getInstance1() {
        if (instance == null) {
            instance = new SingletonLH();
        }
        return instance;
    }

    /**
     * 2、同步方法，线程安全
     */
    public synchronized SingletonLH getInstance2() {
        if (instance == null) {
            instance = new SingletonLH();
        }
        return instance;
    }

    /**
     * 3、双重检查锁定，线程安全
     */
    public SingletonLH getInstance3() {
        if (instance == null) {
            synchronized (SingletonLH.class) {
                if (instance == null) {
                    instance = new SingletonLH();
                }
            }
        }
        return instance;
    }

    /**
     * 4、静态内部类，线程安全，避免同步带来的开销
     */
    public SingletonLH getInstance4() {
        return SingletonHolder.SINGLETON_LH;
    }

    private static class SingletonHolder{
        private static final SingletonLH SINGLETON_LH = new SingletonLH();
    }
}
