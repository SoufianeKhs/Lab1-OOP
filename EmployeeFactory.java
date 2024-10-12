package com.algonquin.cst8288.lab1.factory;

import com.algonquin.cst8288.lab1.Employee;
import com.algonquin.cst8288.lab1.builder.FullTimeEmployeeBuilder;
import com.algonquin.cst8288.lab1.builder.PartTimeEmployeeBuilder;
import com.algonquin.cst8288.lab1.builder.EmployeeDirector;
import java.util.Scanner;

/**
 * Factory class to create different types of employees based on input.
 * This class implements the Factory design pattern to generate employee instances.
 * 
 * @author Soufiane Khssassi
 */
public class EmployeeFactory {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Creates and returns an Employee object based on the specified employee type.
     * Prompts the user to enter employee details dynamically.
     * 
     * @param type The type of employee to create.
     * @return An instance of the corresponding Employee class.
     */
    public static Employee createEmployee(String type) {
        EmployeeDirector director;
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Role: ");
        String role = scanner.nextLine();

        System.out.print("Enter Working Hours Per Week: ");
        int hours = scanner.nextInt();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); 

        switch (type.toLowerCase()) {
            case "fulltime":
                director = new EmployeeDirector(new FullTimeEmployeeBuilder());
                return director.constructEmployee(id, name, department, role, hours, salary);
            case "parttime":
                director = new EmployeeDirector(new PartTimeEmployeeBuilder());
                return director.constructEmployee(id, name, department, role, hours, salary);
            default:
                throw new IllegalArgumentException("Invalid employee type: " + type);
        }
    }
}