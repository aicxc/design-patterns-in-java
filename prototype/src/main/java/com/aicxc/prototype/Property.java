package com.aicxc.prototype;

/**
 * @author Hyy
 * @version 2019/08/02 16:09
 */
public class Property {

    private String key;

    private String value;

    public Property() {

    }

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return String.format("key = %s, value = %s", key, value);
    }
}
