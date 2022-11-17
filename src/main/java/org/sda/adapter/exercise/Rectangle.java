package org.sda.adapter.exercise;

/**
 * Create a target interface called Rectangle, and it should have the following:
 * - getWidth() - abstract method
 * - getHeight() - abstract method
 * - getArea() - default method that should return the value of getWidth() * getHeight()
 * <p>
 * Create a class called square that has one field called side, which represents the length of a side of the square.
 * <p>
 * Create an adapter that will allow us to use the Rectangle interface to find the width, height and area of the square.
 *
 * @author Kristel Talimaa
 */

public interface Rectangle {

    int getWidth();

    int getHeight();

    default int getArea() {
        return getWidth() * getHeight();
    }
}
