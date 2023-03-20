// The Service class contains the logic of each operation the system can do
package com.audreynanual;

// import java.util.HashSet;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Service {

    // instance variables
    int id;
    String firstName;
    String lastName;
    int age;
    String department;
    String occupation;
    double salary;

    // user input
    Scanner userInput = new Scanner(System.in);

    // This HashMap object will contain/store all employee details in key-value pairs
    HashMap<Integer, Employee> employeeSet = new HashMap<>();

    // employee information
    Employee employee1 = new Employee(13001, "James", "Smith", 27, "Information Technology", "Developer", 30000);
    Employee employee2 = new Employee(13002, "Maria", "Rodriguez", 26, "Information Technology", "Tester", 28000);
    Employee employee3 = new Employee(13003, "David", "Brown", 30, "Administrative", "Receptionist", 25000);

    // constructor method
    public Service() {
        // Add the sets of information in each Employee object to the employeeSet HashMap
        employeeSet.put(employee1.getID(), employee1);
        employeeSet.put(employee2.getID(), employee2);
        employeeSet.put(employee3.getID(), employee3);
    }

    // 2: View an employee based on their ID
    public void viewEmployeeByID() {

        System.out.print("Enter employee ID: ");
        id = userInput.nextInt();
        System.out.println("");

        Employee queriedEmployee = employeeSet.get(id);

        if (queriedEmployee == null) {
            System.out.println("There is no employee with this ID.\n");
        } else {
            System.out.println(queriedEmployee);
        }
    }

    // 3: Update employee information
    public void updateEmployee() {

        System.out.print("Enter employee ID: ");
        id = userInput.nextInt();
        System.out.println("");

        Employee queriedEmployee = employeeSet.get(id);

        if (queriedEmployee == null) {
            System.out.println("There is no employee with this ID.\n");

        } else {           
            // update first name
            System.out.print("Enter new first name: ");
            firstName = userInput.next();    
            queriedEmployee.setFirstName(firstName);  

            // update last name
            System.out.print("Enter new last name: ");
            lastName = userInput.next();
            queriedEmployee.setLastName(lastName);

            // update age
            System.out.print("Enter new age: ");
            age = userInput.nextInt();
            queriedEmployee.setAge(age);

            // update department
            System.out.print("Enter new department: ");
            department = userInput.next();
            queriedEmployee.setDepartment(department);

            // update occupation
            System.out.print("Enter new occupation: ");
            occupation = userInput.next();
            queriedEmployee.setOccupation(occupation);

            // update salary
            System.out.print("Enter new salary: ");
            salary = userInput.nextDouble();
            queriedEmployee.setSalary(salary);

            // display updated details
            System.out.print("Updated employee details: ");
            System.out.println(queriedEmployee);
            employeeSet.put(id, queriedEmployee);

            // message
            System.out.println("Employee information updated successfully.\n");
        }
    }


    // 4. Delete an employee record
    public void deleteEmployee() {

        System.out.print("Enter employee ID: ");
        id = userInput.nextInt();
        System.out.println("");

        Employee queriedEmployee = employeeSet.get(id);

        // if inputted ID is not in the HashMap, print out the following message
        if (queriedEmployee == null) {
            System.out.println("There is no employee with this ID.\n");

        } else {
            System.out.println("Employee information deleted successfully.\n");
            employeeSet.remove(queriedEmployee.getID());
        }
    }

    // 5: View all employees
    public void viewAllEmployees() {

        // iterating through key/value mappings
        // for (Entry<Integer, Employee> entry: employeeSet.values()) {
        //     System.out.println(entry);
        //     System.out.println("");
        // }

        for (Employee value: employeeSet.values()) {
            System.out.println(value);
            System.out.println("");
        }
    }
}
