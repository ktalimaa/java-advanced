package org.sda.model.homework;

public class ShapeMain {
    public static void main(String[] args) {

        Rectangle rectangleOverride = new Rectangle();
        rectangleOverride.setArea(60);
        System.out.println(rectangleOverride.getArea());

        Circle circleOverride = new Circle();
        circleOverride.setArea(40);
        System.out.println(circleOverride.getArea());

    }
}
