// The Service class contains the logic of each operation the system can do
package com.audreynanual;
import java.util.HashSet;
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
    
    // This HashSet object will contain/store all employee details (since this system does not have a database)
    HashSet<Employee> employeeSet = new HashSet<Employee>();

    // employee information
    Employee employee1 = new Employee(13001, "James", "Smith", 27, "Information Technology", "Developer", 30000);
    Employee employee2 = new Employee(13002, "Maria", "Rodriguez", 26, "Information Technology", "Tester", 28000);
    Employee employee3 = new Employee(13003, "David", "Brown", 30, "Administrative", "Receptionist", 25000);
    Employee employee4 = new Employee(13004, "Elizabeth", "Williams", 29, "Administrative", "Executive Assistant", 35000);
    Employee employee5 = new Employee(13005, "Thomas", "Clark", 25, "Legal", "Compliance Officer", 37000);
    Employee employee6 = new Employee(13006, "Hannah", "Miller", 32, "Accounting and Finance", "Accountant", 33000);

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

    // Service 2: View an employee based on their ID
    public void viewEmployeeByID() {
        boolean found = false;
        System.out.print("\nEnter employee ID: ");
        id = userInput.nextInt(); 
        System.out.println("");

        for (Employee employee:employeeSet) {
            if(employee.getID() == id) {
                System.out.println(employee);
                found = true;
                break;
            }}

        if (!found) {
            System.out.println("There is no employee with this ID.\n");

        }
    }

    // Service 3: Update employee information
    public void updateEmployee() {
        System.out.println("Enter employee ID: ");
        id = userInput.nextInt();
        for (Employee employee:employeeSet) {
            if(employee.getID() == id) {
                // update first name
                System.out.println("Enter new first name: ");
                firstName = userInput.next();    
                employee.setFirstName(firstName);            
                // update last name
                System.out.println("Enter new last name: ");
                lastName = userInput.next();
                employee.setLastName(lastName);
                // update age
                System.out.println("Enter new age: ");
                age = userInput.nextInt();
                employee.setAge(age);
                // update department
                System.out.println("Enter new department: ");
                department = userInput.next();
                employee.setDepartment(department);
                // update occupation
                System.out.println("Enter new occupation: ");
                occupation = userInput.next();
                employee.setOccupation(occupation);
                // update salary
                System.out.println("Enter new salary: ");
                salary = userInput.nextDouble();
                employee.setSalary(salary);
            }
        }
    }

    // Service 5: View all employees
    public void viewAllEmployees() {
        for(Employee employee:employeeSet) {
            System.out.println(employee);
        }        
    }
}
