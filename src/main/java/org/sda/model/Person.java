package org.sda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Locale;

/**
 * Person model
 *
 * @author Kristel Talimaa
 */
@AllArgsConstructor
@Getter
@ToString
public class Person {       // outer class
    private String firstName;
    private String lastName;
    private String username;
    private int age;


    public boolean isAdult() {
        return age >= 18;
    }

    // this username will change the value of outer class
    // all the non-static classes can access to outer class

    // non-static inner class, without keyword static

    @Getter
    @Setter
    @ToString       // all these things can be used here also
    public class Employee {      // inner class (non-static)
        private String address;
        public void username() {
            username = firstName.concat(lastName).toLowerCase().replace(" ", "");  // changing the value of outer class (Person) // fields from thr outer class
        }
    }



    // Static nested class: not bound to outer class
    @Getter
    @Setter
    public static class Customer {
        public void username(Person person) {
            person.username = person.firstName.concat(person.lastName).toUpperCase().replace(" ", "");
        }
    }


}
