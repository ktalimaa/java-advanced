package org.sda;

import org.sda.model.*;
import org.sda.model.homework.Rectangle;

import java.util.Arrays;

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
        Passenger passenger = new Passenger(PaymentType.CARD, "Pärnu");
        passenger.setEmail("passenger@gmail.com");       // Access Person fields using Passenger object. Also, can extra set email field from here

        PrivatePassenger privatePassenger = new PrivatePassenger(PaymentType.CARD, "Pärnu");
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
        Person person4 = new Passenger(PaymentType.CARD, "Tallinn");
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
        Passenger passenger2 = new Passenger(123456L, "Tallinn", PaymentType.CASH, "Tartu");
        printPersonAddress(passenger2);
        printPassengerWithPrefix("Passenger: ", passenger2);

        // Composition exercise
        // Creating Muzzle object -> have to create Dog object also
        Muzzle muzzle = new Muzzle();
        muzzle.setId(890L);
        muzzle.setNoiseRange(10);
        muzzle.setTooNoisy(true);

        Dog dog1 = new Dog(true, "DOBERMAN");       // generate toString in Muzzle
        dog1.setMuzzle(muzzle);

        System.out.println(dog1.getMuzzle().toString());       // calls Muzzles toString

        // ENUMS
        System.out.println(PaymentType.CARD);        // prints enum CARD
        System.out.println(Arrays.toString(PaymentType.values()));   // will print all the enum values
        System.out.println(PaymentType.BANK_TRANSFER.getValue());     // prints the value which is set to enums in paymentType class, for example 3

        for (PaymentType paymentType : PaymentType.values()) {
            System.out.println(paymentType.name());     // for loop for enums, always use name() not toString()
        }

        System.out.println(PaymentType.MOBILE_BANKING.toString());

        //ENUM EXERCISE
        System.out.println(">>>>>>>>>>PLANETS<<<<<<<<<<");
        System.out.println(Planets.JUPITER.toString());
        System.out.println("Distance of " + Planets.JUPITER.name() + " from Earth: " + Planets.JUPITER.distanceFromEarth());
        System.out.println("----------------------------");
        System.out.println(Planets.MARS.toString());
        System.out.println("Distance of " + Planets.MARS.name() + " from Earth: " + Planets.MARS.distanceFromEarth());
    }


    private static void printPersonAddress(Person person) {
        System.out.println(person.getAddress());
    }

    private static void printPassengerWithPrefix(String prefix, Object object) {
        System.out.println(prefix + object);
    }
}