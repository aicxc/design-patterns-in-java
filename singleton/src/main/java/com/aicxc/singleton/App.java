package com.aicxc.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        SingletonEH eh1 = SingletonEH.getInstance();
        SingletonEH eh2 = SingletonEH.getInstance();
        SingletonEH eh3 = SingletonEH.getInstance();
        SingletonEH eh4 = SingletonEH.getInstance();
        LOGGER.info("eh1 = {}", eh1.hashCode());
        LOGGER.info("eh2 = {}", eh2.hashCode());
        LOGGER.info("eh3 = {}", eh3.hashCode());
        LOGGER.info("eh4 = {}", eh4.hashCode());


        SingletonLH lh1_1 = SingletonLH.getInstance1();
        SingletonLH lh1_2 = SingletonLH.getInstance1();
        SingletonLH lh1_3 = SingletonLH.getInstance1();
        SingletonLH lh1_4 = SingletonLH.getInstance1();
        LOGGER.info("lh1_1 = {}", lh1_1.hashCode());
        LOGGER.info("lh1_2 = {}", lh1_2.hashCode());
        LOGGER.info("lh1_3 = {}", lh1_3.hashCode());
        LOGGER.info("lh1_4 = {}", lh1_4.hashCode());

        for (int i = 0; i < 100000; i++) {
            new Thread(()->{
                SingletonLH lh = SingletonLH.getInstance1();
                LOGGER.info("lh1_1 = {}", lh.hashCode());
            }).start();

            new Thread(()->{
                SingletonLH lh = SingletonLH.getInstance1();
                LOGGER.info("lh1_2 = {}", lh.hashCode());
            }).start();
        }

    }
}
