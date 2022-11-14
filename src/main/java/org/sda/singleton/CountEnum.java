package org.sda.singleton;

public enum CountEnum {

    INSTANCE;
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}
