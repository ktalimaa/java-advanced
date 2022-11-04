package org.sda.model.homework;

public class Rectangle extends Shape {

    private float sideLength;

    private float area;

    private float perimeter;

    public Rectangle() {
        super();
        this.sideLength = sideLength;
        this.area = area;
    }

    @Override
    public void Shape() {
        System.out.println(super.getArea() + " is the area of the rectangle.");
    }

    public Rectangle(float circumference, float area, boolean isRound, float sideLength, float area1) {
        super(circumference, area, isRound);
        this.sideLength = sideLength;
        this.area = area1;
    }

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public float getArea() {
        return 50;
    }

    @Override
    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public void perimeter() {

    }

    @Override
    public void area() {

    }

    public float setArea() {
        return 50;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}



