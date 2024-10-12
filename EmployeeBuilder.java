package com.algonquin.cst8288.lab1.builder;

import com.algonquin.cst8288.lab1.Employee;

/**
 * Interface for building an Employee object.
 * Defines methods for setting various properties of an employee.
 * 
 * @author Soufiane Khssassi
 */
public interface EmployeeBuilder {
    /**
     * Sets the ID of the employee.
     * 
     * @param id The unique identifier for the employee.
     * @return The current instance of EmployeeBuilder.
     */
    EmployeeBuilder setId(int id);

    /**
     * Sets the name of the employee.
     * 
     * @param name The name of the employee.
     * @return The current instance of EmployeeBuilder.
     */
    EmployeeBuilder setName(String name);

    /**
     * Sets the department of the employee.
     * 
     * @param department The department where the employee works.
     * @return The current instance of EmployeeBuilder.
     */
    EmployeeBuilder setDepartment(String department);

    /**
     * Sets the role of the employee.
     * 
     * @param role The role of the employee in the organization.
     * @return The current instance of EmployeeBuilder.
     */
    EmployeeBuilder setRole(String role);

    /**
     * Sets the working hours per week for the employee.
     * 
     * @param hours The number of hours the employee works per week.
     * @return The current instance of EmployeeBuilder.
     */
    EmployeeBuilder setWorkingHoursPerWeek(int hours);

    /**
     * Sets the salary of the employee.
     * 
     * @param salary The salary of the employee.
     * @return The current instance of EmployeeBuilder.
     */
    EmployeeBuilder setSalary(double salary);

    /**
     * Builds and returns the constructed Employee object.
     * 
     * @return The constructed Employee object.
     */
    Employee build();
}
