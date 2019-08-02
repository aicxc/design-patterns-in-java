package com.aicxc.prototype;

/**
 * clone()为浅拷贝
 */
public class Prototype implements Cloneable {

    private String name;

    private int age;

    private Property property;

    public Prototype() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Property getProperty() {
        return this.property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Prototype(String name, int age, Property property) {
        this.name = name;
        this.age = age;
        this.property = property;
    }

    @Override
    protected Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    @Override
    public String toString() {
        return String.format("name = %s, age = %d, property = %s", name, age, property.toString());
    }

}
