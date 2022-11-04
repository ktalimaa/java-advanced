package org.sda.model.homework;

public class Circle extends Shape {

    private float perimeter;

    /*
     public Circle(float perimeter) {
        this.perimeter = perimeter;
    }
     */


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

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void Shape() {

    }

    @Override
    public float getArea() {
        return 30;
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
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public void Circle() {
        System.out.println(super.getCircumference() + " is the perimeter of the circle.");
    }



    /*

    public Circle(float perimeter) {
        super(perimeter);
    }
    @Override
    public void perimeter() {
        System.out.println(super.perimeter() + " is the perimeter of the circle.");
    }

    @Override
    public void area() {
        System.out.println(super.area() + " is the area of circle.");
    }


     */
}
