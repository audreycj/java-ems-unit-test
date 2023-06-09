// This Employee class contains all the details of an Employee object

package com.audreynanual;

public class Employee {
    
    // instance variables
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private String occupation;
    private double salary;

    // default constructor method
    public Employee() {

    }

    // parameterized constructor method
    public Employee(int id, String firstName, String lastName, int age, String department, String occupation, double salary) {
        super(); // do i need this?
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.occupation = occupation;
        this.salary = salary;
    }

    // get assigned ID
    public int getID() {
        return id;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // set first name
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    // set last name
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    // get full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // get age
    public int getAge() {
        return age;
    }

    // set age
    public void setAge(int newAge) {
        this.age = newAge;
    }

    // get department
    public String getDepartment() {
        return department;
    }

    // set department
    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    // get occupation
    public String getOccupation() {
        return occupation;
    }

    // set occupation
    public void setOccupation(String newOccupation) {
        this.occupation = newOccupation;
    }

    // get salary
    public double getSalary() {
        return salary;
    }

    // set salary
    public void setSalary (double newSalary) {
        this.salary = newSalary;
    }

    // Override toString() method to provide a more meaningful way of displaying information about the Employee object
    @Override
    public String toString() {
        return
        "ID: " + id +
        "\nName: " + firstName + " " + lastName +
        "\nAge: " + age +
        "\nDepartment: " + department +
        "\nOccupation: " + occupation +
        "\nSalary: " + salary + "\n";
    }  

    
}
