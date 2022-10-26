package org.sda.model.homework;

public class ShapeMain {
    public static void main(String[] args) {

        Rectangle rectangleOverride = new Rectangle();
        rectangleOverride.setArea(50);
        System.out.println(rectangleOverride.setArea());

        Circle circleOverride = new Circle();
        circleOverride.setArea(30);
        System.out.println(circleOverride.setArea());

    }
}
