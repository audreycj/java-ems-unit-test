// This App class contains the main method
package com.audreynanual;
import java.util.Scanner;

public class App {

    // Service object
    Service service = new Service();
    static boolean ordering = true;

    // Displays menu of system services
    public static void displayMenu() {
        System.out.println("Welcome to the Employee Management System!");
        System.out.println("\n1. Add Employee");
        System.out.println("\n2. View Employee");
        System.out.println("\n3. Update Employee");
        System.out.println("\n4. Delete Employee");
        System.out.println("\n5. View All Employees");
        System.out.println("\n6. Exit");
    }


    public static void main( String[] args )
    {
        
    }
}

