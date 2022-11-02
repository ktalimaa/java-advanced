package org.sda.generics;

import java.math.BigDecimal;

/**
 * Fruit class for Generic
 *
 * @author Kristel Talimaa
 */

public class Fruit {
    private String name;
    private String color;
    private BigDecimal price;

    // create public fruit
    public Fruit () {
    }

    // constructor + get and set
    public Fruit(String name, String color, BigDecimal price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // add toString


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
