package com.aicxc.factorymethod;

/**
 * @author Hyy
 * @version 2019/07/30 11:40
 */
public class Factory2 implements Factory {
    @Override
    public Product createProduct() {
        return new Product2();
    }
}
