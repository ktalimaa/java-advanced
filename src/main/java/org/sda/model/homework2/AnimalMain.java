package org.sda.model.homework2;

import java.util.Arrays;

public class AnimalMain {
    public static void main(String[] args) {
        HomeworkDog dog = new HomeworkDog();
        dog.setName("Chester");
        Cat cat = new Cat();
        cat.setName("Purr");

        Animal[] animals = Animal.yieldVoice();

        for (Animal animal : animals) {
            Animal.yieldVoice();
            System.out.println(Arrays.toString(animals));
        }
        System.out.println(dog.getName());
        System.out.println(cat.getName());
    }
}
