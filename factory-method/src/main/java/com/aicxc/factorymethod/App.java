package com.aicxc.factorymethod;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        Product product = factory1.createProduct();
        product.use();

        Factory factory2 = new Factory2();
        Product product2 = factory2.createProduct();
        product2.use();
    }
}
