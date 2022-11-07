package org.sda.lambda;

import org.sda.model.Person;

import java.util.function.Predicate;

/**
 * To volidate the person
 *
 * @author Kristel Talimaa
 */
public class AdultPersonTest implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.getAge() >= 18;
    }
}
