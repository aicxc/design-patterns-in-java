package com.aicxc.prototype;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Property property = new Property("name", "Hyy");
        Prototype p1 = new Prototype("hello", 123, property);
        Prototype p2 = (Prototype) p1.clone();

        System.out.println("p1==p2: " + (p1.hashCode() == p2.hashCode()));
        System.out.println("p1.property==p2.property: " + (p1.getProperty().hashCode() == p2.getProperty().hashCode()));

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        p1.getProperty().setValue("qqqqqqqqqqq");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        p1.setName("ttttttttt");

        System.out.println(p1.toString());
        System.out.println(p2.toString());



    }
}
