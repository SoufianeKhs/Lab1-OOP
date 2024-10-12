package com.algonquin.cst8288.lab1.builder;

import com.algonquin.cst8288.lab1.Employee;
import com.algonquin.cst8288.lab1.factory.FullTimeEmployee;

/**
 * Builder class for creating a FullTimeEmployee.
 * This class implements the EmployeeBuilder interface and builds a FullTimeEmployee.
 * 
 * @author Soufiane Khssassi
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    @Override
    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public EmployeeBuilder setWorkingHoursPerWeek(int workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
        return this;
    }

    @Override
    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public Employee build() {
        return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}
