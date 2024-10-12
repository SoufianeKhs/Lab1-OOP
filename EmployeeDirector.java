package com.algonquin.cst8288.lab1.builder;

import com.algonquin.cst8288.lab1.Employee;

/**
 * The EmployeeDirector class is responsible for constructing Employee objects
 * using the specified EmployeeBuilder.
 * 
 * 
 * @author Soufiane Khssassi
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    /**
     * Constructor for EmployeeDirector.
     * Initializes the EmployeeDirector with a specific EmployeeBuilder.
     * 
     * @param builder The EmployeeBuilder to use for constructing employees.
     */
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * Sets the EmployeeBuilder to be used by the EmployeeDirector.
     * 
     * @param builder The EmployeeBuilder to use for constructing employees.
     */
    public void setBuilder(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * Constructs and returns an Employee object using the configured EmployeeBuilder
     * based on the provided user input.
     * 
     * @param id The employee's ID.
     * @param name The employee's name.
     * @param department The department of the employee.
     * @param role The role of the employee in the organization.
     * @param workingHoursPerWeek The number of hours the employee works per week.
     * @param salary The salary of the employee.
     * @return The constructed Employee object.
     */
    public Employee constructEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        return builder
                .setId(id)
                .setName(name)
                .setDepartment(department)
                .setRole(role)
                .setWorkingHoursPerWeek(workingHoursPerWeek)
                .setSalary(salary)
                .build();
    }
}
