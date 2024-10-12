package com.algonquin.cst8288.lab1.factory;

import com.algonquin.cst8288.lab1.Employee;

/**
 * Concrete class representing a full-time employee.
 * Extends the abstract Employee class and implements its abstract methods.
 * 
 * 
 * @author Soufiane Khssassi
 */
public class FullTimeEmployee extends Employee {

    /**
     * Constructor to initialize a FullTimeEmployee object with the specified attributes.
     * 
     * @param id The unique identifier for the employee.
     * @param name The name of the employee.
     * @param department The department where the employee works.
     * @param role The role of the employee in the organization.
     * @param workingHoursPerWeek The number of hours the employee works per week.
     * @param salary The salary of the employee.
     */
    public FullTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    @Override
    public void clockIn() {
        System.out.println("Full-time employee clocked in.");
    }

    @Override
    public void clockOut() {
        System.out.println("Full-time employee clocked out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println("Tracking work hours for full-time employee.");
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", role='" + getRole() + '\'' +
                ", workingHoursPerWeek=" + getWorkingHoursPerWeek() +
                ", salary=" + getSalary() +
                '}';
    }
}
