// This Employee class contains all the details of an Employee object

package com.audreynanual;

public class Employee {
    
    // instance variables
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
    private String department;
    private double salary;

    // default constructor method
    public Employee() {

    }

    // parameterized constructor method
    public Employee(int id, String firstName, String lastName, int age, String occupation, String department, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.department = department;
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
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    // set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public void setAge(int age) {
        this.age = age;
    }

    // get occupation
    public String getOccupation() {
        return occupation;
    }

    // set occupation
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    // get department
    public String getDepartment() {
        return occupation;
    }

    // set department
    public void setDepartment(String department) {
        this.department = department;
    }

    // get salary
    public double getSalary() {
        return salary;
    }

    // set salary
    public void setSalary (double salary) {
        this.salary = salary;
    }


}
