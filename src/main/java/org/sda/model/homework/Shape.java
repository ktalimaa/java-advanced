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

    private float circumference;

    private float area;

    private boolean isRound;

    public Shape() {

    }

    public Shape(float circumference, float area, boolean isRound) {
        this.circumference = circumference;
        this.area = area;
        this.isRound = isRound;
    }

    public Shape(float perimeter) {
    }

    public float getCircumference() {
        return circumference;
    }

    public void setCircumference(float circumference) {
        this.circumference = circumference;
    }

    public abstract void Shape();

    public float getArea() {
        return area;
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
