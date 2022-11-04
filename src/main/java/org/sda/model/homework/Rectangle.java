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

    @Override
    public void Shape() {

    }

    public static void main(String[] args) {
        System.out.println(getCircumference() + " is the perimeter of the rectangle.");
        System.out.println(getArea() + " is the area of the rectangle.");
    }
}



