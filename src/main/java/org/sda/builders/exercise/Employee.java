package org.sda.builders.exercise;

/**
 * Create an object class called Employee and add the following fields to it:
 * firstName, lastName, age, nameOfEmployer, phoneNumber, email, salary
 *
 * Create a builder to handle the creation of the Employee object
 * as a static builder class in the Employee.java file
 *
 * @author Kristel Talimaa
 */

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String nameOfEmployer;
    private String phoneNumber;
    private String email;
    private int salary;

    // constructor
    public Employee(String firstName, String lastName, int age, String nameOfEmployer, String phoneNumber, String email, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nameOfEmployer = nameOfEmployer;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
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

    public String getNameOfEmployer() {
        return nameOfEmployer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    // toString
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nameOfEmployer='" + nameOfEmployer + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder()
                .withFirstName("Kristel")
                .withLastName("Talimaa")
                .withAge(26)
                .withNameOfEmployer("Postimees")
                .withPhoneNumber("+372 555 5555")
                .withEmail("kristeltalimaa@gmail.com")
                .withSalary(3000)
                .build();

        System.out.println("Employees full name is: " + employee.getFirstName() + " " + employee.getLastName() + ". Empolyee is " + employee.getAge() + " years old and works in " + employee.getNameOfEmployer() + ".");

    }

    // configuring methods and builder should be in this class with static

}
