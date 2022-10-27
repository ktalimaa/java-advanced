package org.sda.model;

/**
 * 1. Create enum Planets.
 * a) Override toString method. It should print relative size of a planet and it’s name.
 * E.g. „Huge Jupiter”, „Small Pluto”.
 * b) Create distanceFromEarth method.
 * c) Verify both methods for multiple planets
 *
 * @author Kristel Talimaa
 */

public enum Planets {
    MARS (250000, "Adjacent Mars"),
    EARTH (300000, "My Earth"),
    JUPITER (40000000, "Huge Jupiter"),
    SATURN (35000000, "Ring Saturn"),
    PLUTO (100000, "Small Pluto"),
    VENUS (150000, "Evening star Venus");

    private float relativeSize;
    private String name;

    Planets(float relativeSize, String name) {
        this.relativeSize = relativeSize;
        this.name = name;
    }

    public void setRelativeSize(float relativeSize) {
        this.relativeSize = relativeSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "relativeSize=" + relativeSize +
                ", name='" + name + '\'' +
                '}';
    }

    public double distanceFromEarth() {
        return EARTH.relativeSize - this.relativeSize;



    }


}
