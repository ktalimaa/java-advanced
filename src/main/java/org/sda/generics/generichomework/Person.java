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
    public static void main(String[] args) {

        Length personLength1 = new Length(174);
        Length personLength2 = new Length(180);

        System.out.println("Person 1 is taller than person 2: " + personLength1.isTaller(personLength2));

    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}