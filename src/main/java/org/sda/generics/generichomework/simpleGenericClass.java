package org.sda.generics.generichomework;

/**
 * Create a simple Generic class, that will give a possibility, to store any kind of value within.
 * Add object of type String, Integer and Double to array of that Generic type.
 * Print all values of the array within a loop.
 *
 * @author Kristel Talimaa
 */

public class simpleGenericClass<T> {

    private T stringValue;
    private T integerValue;
    private T doubleValue;

    public T getStringValue() {
        return stringValue;
    }

    public void setStringValue(T stringValue) {
        this.stringValue = stringValue;
    }

    public T getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(T integerValue) {
        this.integerValue = integerValue;
    }

    public T getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(T doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void main(String args[]) {
        simpleGenericClass<String> type = new simpleGenericClass<>();
        type.setStringValue("Generic exercise, ");
        type.setIntegerValue(String.valueOf(1 + ", "));
        type.setDoubleValue(String.valueOf(3.5d));
        System.out.println(type.stringValue.concat(type.integerValue).concat(type.doubleValue));

    }
}

/*

 public static void main(String[] args) {

        Object[] x = new Object[]{1,2,3,"srk"};
        for(Object o: x){
            System.out.println(o.getClass());
        }

    }

 public static <E> void printArray(E[] inputArray) {

        // display array elements
        for (E element : inputArray)
            System.out.printf("%s ", element);


 */