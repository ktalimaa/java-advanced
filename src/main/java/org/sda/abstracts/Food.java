package org.sda.abstracts;

/**
 * An abstract Food class
 *
 * @author Kristel Talimaa
 */

public abstract class Food {        // add abstract before class

    // create constructor + getter and setter
    private String color;

    public Food(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Create interface (cannot use private, can use public, protected).
    // Abstract method means that we can only declare it here, but cannot write the implementation here.
    // The implementation will be in the extending class(es).
    // Cannot create object in the abstract class.
    public abstract void eat();


}
