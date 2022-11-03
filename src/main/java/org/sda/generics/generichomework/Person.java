package org.sda.generics.generichomework;

/**
 * 1. Create a Person class that will implement a Comparable interface. Person class should implement compareTo method,
 * that will verify if one person is taller than another.
 * 2. Create a simple Generic class, that will give a possibility to store any kind of value within. Add object
 * of type String, Integer and Double to array of that Generic type. Print all values of the array within a loop.
 *
 * @author Kristel Talimaa
 */

public class Person implements Comparable<Person> {

    private int personLength;

    public Person(int personLength) {
        this.personLength = personLength;
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
