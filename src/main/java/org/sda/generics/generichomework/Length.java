package org.sda.generics.generichomework;

/**
 * Implementation of Comparable interface
 *
 * @author Kristel Talimaa
 */

public class Length {

    private float personLength;

    public Length(float personLength) {
        this.personLength = personLength;
    }

    @Override
    public String toString() {
        return "Length{" +
                "personLength=" + personLength +
                '}';
    }

    public boolean isTaller(Length personLength2) {
        return false;
    }
}
