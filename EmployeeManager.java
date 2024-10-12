package com.algonquin.cst8288.lab1.manager;

import com.algonquin.cst8288.lab1.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that manages the employees in the system.
 * This class provides methods to add, remove, and retrieve employees.
 * 
 * @author Soufiane Khssassi
 */
public class EmployeeManager {
    private static EmployeeManager instance;

    private List<Employee> employees;

    /**
     * Private constructor.
     * Initializes the list of employees.
     */
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Gets the single instance of EmployeeManager.
     * 
     * @return The single instance of EmployeeManager.
     */
    public static synchronized EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    /**
     * Adds an employee to the list of employees.
     * 
     * @param employee The employee to be added.
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Removes an employee from the list of employees.
     * 
     * @param employee The employee to be removed.
     * @return true if the employee was successfully removed, false otherwise.
     */
    public boolean removeEmployee(Employee employee) {
        return employees.remove(employee);
    }

    /**
     * Retrieves the list of all employees.
     * 
     * @return The list of all employees in the system.
     */
    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}
