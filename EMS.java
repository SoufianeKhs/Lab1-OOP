package com.algonquin.cst8288.lab1.simulation;

import com.algonquin.cst8288.lab1.Employee;
import com.algonquin.cst8288.lab1.builder.FullTimeEmployeeBuilder;
import com.algonquin.cst8288.lab1.builder.PartTimeEmployeeBuilder;
import com.algonquin.cst8288.lab1.builder.EmployeeDirector;
import com.algonquin.cst8288.lab1.manager.EmployeeManager;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The EMS class simulates the Employee Management System.
 * It creates instances of employees using the Builder and Factory patterns and allows interaction
 * through a menu-driven console interface. 
 * 
 * 
 * @author Soufiane Khssassi
 */
public class EMS {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Main method to simulate the Employee Management System.
     * Creates several instances of employees using Builder and Factory patterns and adds them 
     * to the EmployeeManager. Allows the user to create, display, and remove employees interactively.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        EmployeeManager employeeManager = EmployeeManager.getInstance();

        Employee sampleFullTimeEmployee = new EmployeeDirector(new FullTimeEmployeeBuilder())
                .constructEmployee(1, "John Doe", "Engineering", "Developer", 40, 80000);
        Employee samplePartTimeEmployee = new EmployeeDirector(new PartTimeEmployeeBuilder())
                .constructEmployee(2, "Jane Smith", "Marketing", "Consultant", 20, 40000);

        employeeManager.addEmployee(sampleFullTimeEmployee);
        employeeManager.addEmployee(samplePartTimeEmployee);

        int choice;

        do {
            System.out.println("\nWelcome to the Employee Management System");
            System.out.println("1. Create a Full-Time Employee");
            System.out.println("2. Create a Part-Time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Remove an Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    createEmployee(employeeManager, true);
                    break;
                case 2:
                    createEmployee(employeeManager, false);
                    break;
                case 3:
                    displayEmployees(employeeManager);
                    break;
                case 4:
                    removeEmployee(employeeManager);
                    break;
                case 5:
                    System.out.println("Exiting the Employee Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    /**
     * Creates an employee using the specified builder based on user input.
     * Prompts the user to enter employee details and handles input validation for both numeric and non-numeric fields.
     * 
     * @param employeeManager The EmployeeManager instance to manage employees.
     * @param isFullTime Indicates if the employee to be created is full-time or part-time.
     */
    private static void createEmployee(EmployeeManager employeeManager, boolean isFullTime) {
        int id = 0;
        while (true) {
            System.out.print("Enter Employee ID: ");
            try {
                id = scanner.nextInt();
                scanner.nextLine(); 
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value for the Employee ID.");
                scanner.nextLine(); 
            }
        }

        String name;
        while (true) {
            System.out.print("Enter Employee Name: ");
            name = scanner.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid name (letters and spaces only).");
            }
        }

        String department;
        while (true) {
            System.out.print("Enter Department: ");
            department = scanner.nextLine();
            if (department.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid department name (letters and spaces only).");
            }
        }

        String role;
        while (true) {
            System.out.print("Enter Role: ");
            role = scanner.nextLine();
            if (role.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid role (letters and spaces only).");
            }
        }

        int hours = 0;
        while (true) {
            System.out.print("Enter Working Hours Per Week: ");
            try {
                hours = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value for Working Hours.");
                scanner.nextLine(); 
            }
        }

        double salary = 0;
        while (true) {
            System.out.print("Enter Salary: ");
            try {
                salary = scanner.nextDouble();
                scanner.nextLine(); 
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value for Salary.");
                scanner.nextLine();
            }
        }

        EmployeeDirector director = new EmployeeDirector(isFullTime ? new FullTimeEmployeeBuilder() : new PartTimeEmployeeBuilder());
        Employee employee = director.constructEmployee(id, name, department, role, hours, salary);
        employeeManager.addEmployee(employee);

        System.out.println("Employee added: " + employee.getName());
    }

    /**
     * Displays the list of employees in the EmployeeManager.
     * 
     * @param employeeManager The EmployeeManager instance containing the list of employees.
     */
    private static void displayEmployees(EmployeeManager employeeManager) {
        System.out.println("\nList of Employees in the Employee Management System:");
        for (Employee employee : employeeManager.getEmployees()) {
            System.out.println(employee);
        }
    }

    /**
     * Removes an employee from the EmployeeManager based on user input.
     * 
     * @param employeeManager The EmployeeManager instance to manage employees.
     */
    private static void removeEmployee(EmployeeManager employeeManager) {
        System.out.print("Enter the ID of the employee to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        Employee employeeToRemove = null;
        for (Employee employee : employeeManager.getEmployees()) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }

        if (employeeToRemove != null && employeeManager.removeEmployee(employeeToRemove)) {
            System.out.println("Employee removed: " + employeeToRemove.getName());
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }
}
