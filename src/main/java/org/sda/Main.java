package org.sda;

import org.sda.generics.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {

        // GENERIC TYPE
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("green");
        fruit.setPrice(BigDecimal.valueOf(1.99));       // converting double to BigDecimal

        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);            // assigning Fruit class to GenericFood class

        System.out.println(genericFoodWithFruit.getItem());     // there has to be toString in Fruit also

        String str = "I'm a great developer!";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("I'm a good person!");
        System.out.println(genericFoodWithString.getItem());

        // GENERIC TYPE - EXTENDS
        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());

        // GENERIC TYPE - INTERFACE
        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(3);
        System.out.println("Snack 1 is better than snack 2: " + snack1.isBetter(snack2));

        // LIST
        List<String> animalList = new ArrayList<>();
        animalList.add("Lion");     // 0
        animalList.add("Tiger");    // 1
        animalList.add("Dog");      // 2
        animalList.add("Cat");
        animalList.add("Bear");
        animalList.add("Panda");

        System.out.println(animalList.get(1));      // prints tiger

        animalList.remove(1);       // removing item from the list, if nr 1, tiger will be deleted
        animalList.remove("Dog");

        for (String animal : animalList) {
            System.out.println(animal);
        }

        Iterator<String> stringIterator = animalList.listIterator();       // is similar to scanner.hasNext()

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + " ");
        }

        // List of items to be removed
        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Cat");
        removeAnimalList.add("Panda");

        animalList.removeAll(removeAnimalList);

        // Final removed list
        for (String animal : animalList) {
            System.out.println(animal);
        }
    }
}