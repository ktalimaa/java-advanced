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
        privatePassenger.setPhoneNumber("372512345");               // Access Person's field
    }
}