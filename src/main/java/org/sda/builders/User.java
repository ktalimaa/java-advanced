package org.sda.builders;

/**
 * Create a User class having the following fields:
 * firstName, lastName, age, email, phoneNumber, address.
 *
 * Use the builder pattern to create a class called UserBuilder
 * that will be used to make the process of creating a new user easier.
 *
 * @author Kristel Talimaa
 */

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private String address;

    // constructor
    public User(String firstName, String lastName, int age, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public String getEmail() {
        return email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }


    // toString too
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
