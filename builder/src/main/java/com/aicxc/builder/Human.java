package com.aicxc.builder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Hyy
 * @version 2019/07/30 12:02
 */
public class Human {

    private String name;
    private int age;
    private Date birthday;
    private Sex sex;

    private Human() {

    }

    public String toString() {
        return String.format("name = %s, age = %s, birthday = %s, Sex = %s", name, age, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(birthday), sex.toString());
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Date getBirthday() {
        return this.getBirthday();
    }

    public Sex getSex() {
        return this.sex;
    }

    public static class Builder {

        private Human human = new Human();

        public Builder name(String name) {
            human.name = name;
            return this;
        }

        public Builder age(int age) {
            human.age = age;
            return this;
        }

        public Builder birthday(Date birthday) {
            human.birthday = birthday;
            return this;
        }

        public Builder Sex(Sex sex) {
            human.sex = sex;
            return this;
        }

        public Human build() {
            return human;
        }
    }





}
