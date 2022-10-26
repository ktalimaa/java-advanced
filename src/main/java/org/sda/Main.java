package org.sda;

import org.sda.model.Dog;
import org.sda.model.Passenger;
import org.sda.model.Person;
import org.sda.model.PrivatePassenger;

public class Main {
    public static void main(String[] args) {

        // ENCAPSULATION
        // No-arguments constructor call
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.getId());

        // All-argument constructor call
        Person person1 = new Person(12345L, "Kristel", "Talimaa", "kristeltalimaa@gmail.com", "+372512072", "Pärnu linn");
        System.out.println(person1.toString());
        System.out.println(person1.getEmail());

        Person person2 = new Person();
        person2.setFirstName("Martin ");
        person2.setLastName("Põlluste");
        System.out.print(person2.getFirstName());
        System.out.println(person2.getLastName());

        Dog dog = new Dog(true, "Rotveiler");
        System.out.println(dog.toString());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());

        // INHERITANCE
        Passenger passenger = new Passenger("CARD", "Pärnu");
        passenger.setEmail("passenger@gmail.com");       // Access Person fields using Passenger object. Also, can extra set email field from here

        PrivatePassenger privatePassenger = new PrivatePassenger("CARD", "Pärnu");
        privatePassenger.setPersonalIDCode("496010119964225");      // Access PrivatePassenger's field
        privatePassenger.setDestinationAddress("Tallinn");          // Access Passenger's field
        privatePassenger.setPhoneNumber("372512345");       // Access Person's field

        // OVERRIDING
        Person personOverride = new Person();
        personOverride.setEmail("kristeltalimaa@gmail.com");

        System.out.println(personOverride.getEmail());

        Passenger passengerOverride = new Passenger();
        passengerOverride.setEmail("kristeltalimaa@gmail.com");
        System.out.println(passengerOverride.getEmail());

        // POLYMORPHISM - many instances
        Person person3 = new Person(12345L, "Pärnu");
        Person person4 = new Passenger("CARD", "Tallinn");
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        // Calling parent methods
        Passenger passenger1 = new Passenger();
        passenger1.setAddress("Tallinn");       // belongs to person class -> person.address
        passenger1.setDestinationAddress("Tartu");      // belongs to passenger class -> Passenger.destinationAddress
        System.out.println(passenger1.getAddresses());

        // Calling parent's hidden field
        passenger1.getHiddenAlive();

        // Passing parameters
        Passenger passenger2 = new Passenger(123456L, "Tallinn", "CASH", "Tartu");
        printPersonAddress(passenger2);
        printPassengerWithPrefix("Passenger: ", passenger2);
    }

    private static void printPersonAddress(Person person) {
        System.out.println(person.getAddress());
    }

    private static void printPassengerWithPrefix(String prefix, Object object) {
        System.out.println(prefix + object);
    }
}