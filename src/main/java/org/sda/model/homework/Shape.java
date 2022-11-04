package org.sda.model.homework;

/**
 * Create a Shape class.
 * a) Add fields, create constructor, getters and setters.
 * b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
 * Which fields and methods are common?
 *
 * @author Kristel Talimaa
 */

// In Shape class perimeter and area methods should be abstract.

public abstract class Shape {

    private static float circumference;

    private float area;

    private boolean isRound;

    public Shape() {

    }


    public Shape(float perimeter) {
    }

    public Shape(float circumference, float area, boolean isRound) {
    }

    public static float getCircumference() {
        return 5.5f;
    }

    public void setCircumference(float circumference) {
        this.circumference = circumference;
    }

    public abstract void Shape();

    public static float getArea() {
        return 55.5f;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public boolean isRound() {
        return isRound;
    }

    public void setRound(boolean round) {
        isRound = round;
    }

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.getPerimeter();
    }

    public abstract void perimeter();

    public abstract void area();

}
