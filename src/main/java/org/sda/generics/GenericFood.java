package org.sda.generics;

/**
 * Generic food class
 *
 * @author Kristel Talimaa
 */

public class GenericFood<T> {           // add <T> to make it generic       // this T can be anything -> string, int, person, veggie
    private T item;     // private Fruit item

    // add constructor + getter and setter
    public GenericFood(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }



}
