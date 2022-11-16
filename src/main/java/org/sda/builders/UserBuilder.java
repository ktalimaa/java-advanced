package org.sda.builders;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private String address;

    // configuring methods
    public UserBuilder withFirstName (String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName (String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withAge (int age) {
        this.age = age;
        return this;
    }

    public UserBuilder withEmail (String email) {
        this.email = email;
        return this;
    }

    public UserBuilder withPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder withAddress (String address) {
        this.address = address;
        return this;
    }

    // Build method
    public User build() {
        return new User(firstName, lastName, age, email, phoneNumber, address);
    }

}
