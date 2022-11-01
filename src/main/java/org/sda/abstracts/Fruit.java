package org.sda.abstracts;

/**
 * Fruit class matching the abstract class
 *
 * @author Kristel Talimaa
 */

public class Fruit extends Food {           // always use extends in child class
    public Fruit(String color) {
        super(color);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating " + super.getColor() + " fruit!");
    }
}
