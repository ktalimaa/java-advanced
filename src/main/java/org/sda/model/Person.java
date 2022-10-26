package org.sda.model;

import java.util.Random;

/**
 * Person model
 * Example of Encapsulation
 *
 * @author Kristel Talimaa
 */

public class Person {

    // These are called as FIELDS
    private Long id;        // person has an ID
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;     // this is source address of person

    protected boolean isAlive;

    //ALL ARGUMENTS CONSTRUCTOR (generate -> constructor; also can call this parameterized constructor)
    public Person(Long id, String firstName, String lastName, String email, String phoneNumber, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Parameterized constructor
    public Person(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    // Java will create a constructor automatically by default. It is called as default constructor.

    // No-arguments constructor
    public Person() {
        this.id = new Random().nextLong();
    }


    // Getters (to get the value of the field) and setters (assign the value to the field)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected boolean isAlive() {
        return isAlive;
    }

    protected void setAlive(boolean alive) {
        isAlive = alive;
    }

    // Generates the values of the strings
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
