package org.sda;

import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
        // INTERFACE
        Person person = new Person();
        person.setFirstName("Kristel");
        person.setLastName("Talimaa");
        person.setAge(26);

        // Left side should be interface name and right side should be interfaces implementation class name
        PersonService personService = new PersonServiceImpl();

        // Implementation method calls
        System.out.println("Persons birth year: " + personService.getPersonBirthYear(person.getAge()));
        System.out.println("Persons full name: " + personService.getPersonFullName(person));
        System.out.println("Persons last name: " + person.getLastName());
    }
}