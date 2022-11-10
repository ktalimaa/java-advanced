package org.sda;

import org.sda.concurrency.StopWatchRunnableImpl;
import org.sda.concurrency.StopWatchThread;
import org.sda.model.Person;
import org.w3c.dom.ls.LSOutput;

import java.io.StringBufferInputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // LAMBDA EXPRESSION
        // Predicate
        Person person = new Person("Kristel", "Talimaa", "ktalimaa", 26);
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


        // OPTIONAL
        Person person3 = new Person("Kristel", "Talimaa", "ktalimaa", 26);
        Optional<Person> optionalPerson = Optional.of(person3);     // can use Optional.of(); if person3 = null.

        if (optionalPerson.isEmpty()) { // does Person have a value or not
            System.out.println("Person cannot be printed.");
        } else {
            System.out.println(optionalPerson.get().toString());
        }

        optionalPerson.ifPresent(System.out::println);

        System.out.println(getRandomPerson().toString());


        // STREAMS
        // Streams are used when having a list
        List<String> carList = List.of("BMW", "Audi", "Skoda", "Toyota", "Ford");

        carList.stream()
                .findFirst()
                .ifPresent(System.out::println);        // findFirst() -> Optional<T> (any type) -> finds random element of the list
        carList.stream().findAny().ifPresent(System.out::println);


        // Filter: used to apply a condition to the list and filter the list
        List<String> filteredCars = carList.stream()
                .filter(s -> s.length() >= 5)       // Filter returns Stream<T>
                .collect(Collectors.toList());      // Convert Stream<T> to List<T>

        // For each
        filteredCars.forEach(s -> {
            String prefix = "Car: " + s;
            System.out.println(prefix);
        });

        // Map: is used to apply an operation to the all the elements in the list
        List<Integer> carLengths = carList.stream() // map example
                .map(String::length)
                .toList();      // same as collect(Collectors.toList());

        carLengths.forEach(System.out::println);
        System.out.println(carLengths.size());      // counting the items in the list


        // ALL MATCH
        // allMatch(): Used to check if all the elements in the list matching a given condition
        boolean isAllCarsGreaterThanFive = carList.stream()
                .allMatch(s -> s.length() >= 5);    // checking are all the cars in the list are more than 5
        System.out.println(isAllCarsGreaterThanFive);

        // ANY MATCH
        // anyMatch(): Used to check if at least one element in the list matches the given condition
        boolean isAnyCarStartingWithB = carList.stream()
                .anyMatch(s -> s.startsWith("B"));
        System.out.println(isAnyCarStartingWithB);

        // Reducing
        // reduce(): Used to condense/reduce the list to the String/other type
        String cars = carList.stream()
                .reduce("", ((s, s2) -> (s.equals("") ? "" : s + ", ") + s2));      // s is like bmw, s2 is like audi. " " is empty, goes to the next value and puts comma if value exists
        System.out.println(cars);

        // Sorted
        // sorted(): Used to sort the list in the ascending order
        carList.stream()
                .sorted()
                .forEach(System.out::println);

        // descending order sorting
        carList.stream()
                .sorted((car1, car2) -> car2.compareTo(car1))   // comparative sorting, list printed in reverse order
                .forEach(System.out::println);

        // alternative descending order sorting using comparator
        carList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);



        // NESTED CLASS
        // Non-static
        Person person4 = new Person("Kristel", "Talimaa", "ktalimaa", 26);
        System.out.println(person4.getUsername());  // outer class method call

        Person.Employee employee = person4.new Employee();  // to create non-static object, put: outer class . inner class
        employee.username();
        System.out.println(person4.getUsername());

        // Static
        Person person5 = new Person("Martin", "Põlluste", "polluste", 27);
        System.out.println(person5.getUsername()); // outer class method call

        Person.Customer customer = new Person.Customer();       // Difference in the object instantiation
        customer.username(person5);
        System.out.println(person5.getUsername());


        // CONCURRENCY
        System.out.println("Main is running after nested classes...");
        Thread.sleep(5000);     // 5000 = 5 sec     // only when tread is running, then it is possible to make it sleep
        System.out.println("Thread test ended!");

        // Stop-watch thread
        StopWatchThread stopWatchThread = new StopWatchThread("Stop watch nr 1");
        StopWatchThread stopWatchThread2 = new StopWatchThread("Stop watch nr 2");
        stopWatchThread.start();       // starting stop watch thread
        stopWatchThread2.start();       // starting the second stop watch       // multithreading - different instances running on same thread
        System.out.println("Main thread starts running...");
        Thread.sleep(5000);         // this is for main method (makes main sleep)
        System.out.println("Main thread is still running...");
        Thread.sleep(3000);
        System.out.println("Main thread ended running!");

        // Runnable
        System.out.println("Runnable StopWatch started...");
        Thread stopWatchRunnableThread = new Thread(new StopWatchRunnableImpl());
        stopWatchRunnableThread.start();



    }

    // Old-school way of method definition
    private static Integer getLengthOfString(String inputString) {
        int increment = 10;     // now here is two lines of code
        return inputString.length() + increment;
    }

    private static Person getRandomPerson() {
        // Optional<Person> optionalPerson = Optional.empty();     // if optional.empty is true, can return person2
        Optional<Person> optionalPerson = Optional.of(new Person("Captain", "America", "murica", 30));
        Person person2 = new Person("Martin", "Põlluste", "polluste",  27); // backup substitude

        return optionalPerson.orElse(person2);
    }
}