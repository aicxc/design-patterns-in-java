package com.aicxc.builder;

import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Human human = new Human.Builder()
                .age(10)
                .birthday(new Date())
                .name("hyy")
                .Sex(Sex.MAN)
                .build();
        System.out.println(human.toString());
    }
}
