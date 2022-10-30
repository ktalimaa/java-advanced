package org.sda.model.homework2;

import org.sda.model.Dog;

/**
 * Create classes Dog and Cat.
 * a) Move common methods and fields to the class Animal.
 * b) Create method "yieldVoice".
 * c) Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * d) Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 *
 * @author Kristel Talimaa
 */
public class Animal {

    String yieldVoice;
    String name;

    public Animal() {

    }

    // constructor
    public Animal(String yieldVoice, String name) {
        this.yieldVoice = yieldVoice;
        this.name = name;
    }

    // getters and setters

    public String getYieldVoice() {
        return yieldVoice;
    }

    public void setYieldVoice(String yieldVoice) {
        this.yieldVoice = yieldVoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return "Animal{" +
                "yieldVoice='" + yieldVoice + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static Animal[] yieldVoice() {
        HomeworkDog dog = new HomeworkDog();
        dog.setName("Chester");
        dog.setYieldVoice("Woof");

        Cat cat = new Cat();
        cat.setName("Purr");
        cat.setYieldVoice("Meow");

        return new Animal[]{dog, cat};
    }
}

