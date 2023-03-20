// The Service class contains the logic of each operation the system can do
package com.audreynanual;
import java.util.HashSet;
import java.util.Scanner;

public class Service {

    // This HashSet object will contain/store all employee details (since this system does not have a database)
    HashSet<Employee> employeeSet = new HashSet<Employee>();

    // employee information
    Employee employee1 = new Employee(0001, "James", "Smith", 27, "Information Technology", "Developer", 30000);
    Employee employee2 = new Employee(0002, "Maria", "Rodriguez", 26, "Information Technology", "Tester", 28000);
    Employee employee3 = new Employee(0003, "David", "Brown", 30, "Administrative", "Receptionist", 25000);
    Employee employee4 = new Employee(0004, "Elizabeth", "Williams", 29, "Administrative", "Executive Assistant", 35000);
    Employee employee5 = new Employee(0005, "Thomas", "Clark", 25, "Legal", "Compliance Officer", 37000);
    Employee employee6 = new Employee(0006, "Hannah", "Miller", 32, "Accounting and Finance", "Accountant", 33000);

    
    Scanner sc = new Scanner(System.in);

    // instance variables
    int id;
    String firstName;
    String lastName;
    int age;
    String department;
    String occupation;
    double salary;

    // constructor method
    public Service() {
        // Add the sets of information in each Employee object to the employeeSet HashSet
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);
    }

}
