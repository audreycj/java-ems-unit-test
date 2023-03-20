// This App class contains the main method
package com.audreynanual;
import java.util.Scanner;

public class App {

    // Service object
    Service service = new Service();

    // Activated state of the system's "ordering" mode (user will choose a service in the menu)
    static boolean ordering = true;

    // Displays menu of system services
    public static void displayMenu() {
        System.out.println("==============================");
        System.out.println("Employee Management System");
        System.out.println("==============================");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employee");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. View All Employees");
        System.out.println("6. Exit");
    }

    // main method
    public static void main(String[] args) {
        // user input
        Scanner userInput = new Scanner(System.in);

        do {
            displayMenu();
            Service service = new Service();
            
            System.out.print("\nWhat do you want to do? ");
            int choice = userInput.nextInt(); // reads value from userInput and stores it in choice

            switch(choice) {
                case 1:
                    System.out.println("Add Employee");
                    break;
                case 2:
                    service.viewEmployeeByID();
                    break;
                case 3:
                    System.out.println("\nUpdate Employee");
                    break;
                case 4:
                    System.out.println("\nDelete Employee");
                    break;
                case 5:
                    service.viewAllEmployees();
                    break;
                case 6:
                    System.out.println("\nThank you for using the application. See you next time!");
                    System.exit(0);
                default:
                    System.out.println("\nPlease enter a valid service from the menu.");
                    break;
            }
        } while (ordering);
    }
}

