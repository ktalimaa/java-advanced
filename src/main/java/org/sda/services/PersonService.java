package org.sda.services;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;

import java.time.LocalDate;

/**
 * PersonService interface to handle Person related operations
 *
 * @author Kristel Talimaa
 */
public interface PersonService {

    // static field is allowed, but not the normal field
    static final int AVERAGE_AGE = 20;

    // Always write a description same as above. All the description what this main method is about. Declare the method.
    /**
     * To get the birth year of the Person
     *
     * @param age Age of the person
     * @return Birth year
     */
    int getPersonBirthYear(int age);

    /**
     * To get the full name of the person
     * @param person Person model
     * @return return full name as String
     */
    String getPersonFullName(Person person);

    /**
     * To find a Person by first name
     * @param firstName FirstName of a Person
     * @return Person
     */
    Person findPersonByFirstName(String firstName) throws PersonNotFoundException;

    // static method definition is allowed
    static int getAverageAge() {
        return AVERAGE_AGE;
    }
}
