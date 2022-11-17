package org.sda.builders.exercise;

public class EmployeeBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String nameOfEmployer;
    private String phoneNumber;
    private String email;
    private int salary;

    // configuring methods
    public EmployeeBuilder withFirstName (String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder withLastName (String lastName) {
        this.lastName = lastName;
        return this;
    }
    public EmployeeBuilder withAge (int age) {
        this.age = age;
        return this;
    }
    public EmployeeBuilder withNameOfEmployer (String nameOfEmployer) {
        this.nameOfEmployer = nameOfEmployer;
        return this;
    }
    public EmployeeBuilder withPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public EmployeeBuilder withEmail (String email) {
        this.email = email;
        return this;
    }
    public EmployeeBuilder withSalary (int salary) {
        this.salary = salary;
        return this;
    }

    // builder
    public Employee build() {
        return new Employee(firstName, lastName, age, nameOfEmployer, phoneNumber, email, salary);
    }

}
