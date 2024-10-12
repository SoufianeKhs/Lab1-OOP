package com.algonquin.cst8288.lab1;

/**
 * Abstract class representing an Employee.
 * This class defines the properties and methods common to all employee types.
 * 
 * @author Soufiane Khssassi
 */
public abstract class Employee {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    /**
     * Constructor to initialize the Employee object with the specified attributes.
     * 
     * @param id The unique identifier for the employee.
     * @param name The name of the employee.
     * @param department The department where the employee works.
     * @param role The role of the employee in the organization.
     * @param workingHoursPerWeek The number of hours the employee works per week.
     * @param salary The salary of the employee.
     */
    public Employee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    /**
     * Gets the ID of the employee.
     * 
     * @return The ID of the employee.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the employee.
     * 
     * @param id The unique identifier for the employee.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the employee.
     * 
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     * 
     * @param name The name of the employee.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the department of the employee.
     * 
     * @return The department where the employee works.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the employee.
     * 
     * @param department The department where the employee works.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the role of the employee.
     * 
     * @return The role of the employee in the organization.
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role of the employee.
     * 
     * @param role The role of the employee in the organization.
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets the number of hours the employee works per week.
     * 
     * @return The working hours per week of the employee.
     */
    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    /**
     * Sets the number of hours the employee works per week.
     * 
     * @param workingHoursPerWeek The working hours per week of the employee.
     */
    public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    /**
     * Gets the salary of the employee.
     * 
     * @return The salary of the employee.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     * 
     * @param salary The salary of the employee.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Abstract method to handle the clock-in action of an employee.
     */
    public abstract void clockIn();

    /**
     * Abstract method to handle the clock-out action of an employee.
     */
    public abstract void clockOut();

    /**
     * Abstract method to track the work hours of an employee.
     */
    public abstract void trackWorkHours();
}
