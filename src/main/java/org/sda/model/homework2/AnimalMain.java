package org.sda.model.homework2;

import org.sda.model.Dog;
import org.sda.model.Muzzle;

public class AnimalMain {
    public static void main(String[] args) {

        HomeworkDog dog = new HomeworkDog("Chester", "Rotveiler", 5, true);

        Cat cat = new Cat("Purr", 4, true, true);

        Cat catOverride = new Cat();
        catOverride.setName("Purr");
        System.out.println(catOverride.getName());

        HomeworkDog dogOverride = new HomeworkDog();
        dogOverride.setName("Chester");
        System.out.println(dogOverride.getName());




    }
}
