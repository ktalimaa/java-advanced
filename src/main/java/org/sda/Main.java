package org.sda;

import org.sda.model.Person;

import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // LAMBDA EXPRESSION
        // Predicate
        Person person = new Person("Kristel", "Talimaa", 26);
        Predicate<Person> personTest = test -> test.getAge() > 20; // lambda expression
        System.out.println(personTest.test(person));

        System.out.println(getLengthOfString("Java is not easy. Joke! :D")); // calling the old-school method

        // New way of writing method
        Function<String, Integer> getStringLen = s -> {
            int increment = 10;
            return s.length();  // if multiple lines of code, after -> { } and return statement // <Input type, output type> // whenever calling this variable like getStringLen, You have to use apply
        };
        System.out.println(getStringLen.apply("Java is not easy. Joke! :D"));

        // Method reference
        Predicate<Person> personTest2 = Person::isAdult;    // Method reference calling; className::methodName
        System.out.println(personTest2.test(person));

        // Supplier - Doesn't take any arguments, but returns/supplies only the value
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();      // No argument but returns random value // if no value to pass, put () // supplier supplies the value
        System.out.println(randomNumberSupplier.get());     // get() should be called always

        // Consumer - It takes an argument and returns nothing
        Consumer<Person> printPerson = p -> System.out.println("Person first name: " + p.getFirstName() + ", last name: " + p.getLastName());
        printPerson.accept(person);     // consumer uses accept and it should be called always

        // Operator - using inbuilt class
        UnaryOperator<Integer> toSquare = i -> i * i;     // -> means implies
        System.out.println(toSquare.apply(4));  // apply() should be called always
    }

    // Old-school way of method definition
    private static Integer getLengthOfString(String inputString) {
        int increment = 10;     // now here is two lines of code
        return inputString.length() + increment;
    }
}