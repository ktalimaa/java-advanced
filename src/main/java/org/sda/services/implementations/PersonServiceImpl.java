package org.sda.services.implementations;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;

import java.time.LocalDate;
import java.util.List;

/**
 * Implementation of PersonService
 *
 * @author Kristel Talimaa
 */

public class PersonServiceImpl implements PersonService {
    @Override
    public int getPersonBirthYear(int age) {
        return LocalDate.now().getYear() - age;
    }

    @Override
    public String getPersonFullName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }

    @Override
    public Person findPersonByFirstName(String firstName) throws PersonNotFoundException {

        Person resultPerson = null;

        // Search a person with the given first name from the random list
        for (Person person : getRandomPersonList()) {
            if (person.getFirstName().equals(firstName)) {
                resultPerson = person;
                break;
            }
        }

        // If the person is not found then throw an exception
        if (resultPerson == null) {
            throw new PersonNotFoundException(firstName);       // if using throws, always use throws in method name
        }

        return resultPerson;
    }

    //PRIVATE METHODS//
    private List<Person> getRandomPersonList() {
        Person person1 = new Person();
        person1.setFirstName("Kristel");
        person1.setLastName("Talimaa");
        person1.setAge(26);

        Person person2 = new Person();
        person2.setFirstName("Martin");
        person2.setLastName("Põlluste");
        person2.setAge(27);

        Person person3 = new Person();
        person3.setFirstName("Kass");
        person3.setLastName("Purr");
        person3.setAge(8);

        return List.of(person1, person2, person3);
    }
}
