package org.sda.exceptions;

/**
 * Exception to handle if the person is not found
 *
 * @author Kristel Talimaa
 */
public class PersonNotFoundException extends Exception {        // always add extends
    public PersonNotFoundException(String name) {
        super(String.format("The person (%s) is not found!", name));       // super is used to call parent class
    }

    public PersonNotFoundException(int age) {
        super(String.format("The person (%s) is not found!", age));
    }

    public PersonNotFoundException() {

    }
}
