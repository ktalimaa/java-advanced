package org.sda.model.homework;

public class Circle extends Shape {

    private float perimeter;

    private float area;

    public Circle() {
        this.perimeter = perimeter;
        this.area = area;
    }

    public Circle(float circumference, float area, boolean isRound, float perimeter, float area1) {
        super(circumference, area, isRound);
        this.perimeter = perimeter;
        this.area = area1;
    }

    public void getPerimeter() {
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
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
        return 30;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                '}';
    }

    @Override
    public void Shape() {

    }

    public static void main(String[] args) {
        System.out.println(getCircumference() + " is the perimeter of the circle.");
        System.out.println(getArea() + " is the area of the circle.");
    }
}