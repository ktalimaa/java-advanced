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

        // EXCEPTION
        // Exception handling
        try {
            int[] intArray = {1, 4, 56, 7};

            for (int i = 0; i <= intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("The number cannot be printed because its unavailable in the array.");
        } catch (Exception exception) {
            System.out.println("Exception being caught");
        } finally { // This block will be executed irrespective of catch blocks
            int a = 15;
            System.out.println("Finally executed, a:" + a);
        }
    }
}