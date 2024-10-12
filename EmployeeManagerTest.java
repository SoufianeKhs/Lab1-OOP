package com.algonquin.cst8288.lab1.manager;

import com.algonquin.cst8288.lab1.Employee;
import com.algonquin.cst8288.lab1.factory.FullTimeEmployee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for EmployeeManager to validate singleton behavior and employee management.
 */
public class EmployeeManagerTest {

    private EmployeeManager employeeManager;
    private Employee testEmployee;

    @Before
    public void setUp() {
        employeeManager = EmployeeManager.getInstance();
        testEmployee = new FullTimeEmployee(1, "John Doe", "IT", "Developer", 40, 50000);
    }

    @Test
    public void testSingletonBehavior() {
        EmployeeManager anotherInstance = EmployeeManager.getInstance();
        assertSame("EmployeeManager should follow singleton pattern", employeeManager, anotherInstance);
    }

    @Test
    public void testAddEmployee() {
        employeeManager.addEmployee(testEmployee);
        assertTrue("Employee should be added successfully", employeeManager.getEmployees().contains(testEmployee));
    }

    @Test
    public void testRemoveEmployee() {
        employeeManager.addEmployee(testEmployee);
        employeeManager.removeEmployee(testEmployee);
        assertFalse("Employee should be removed successfully", employeeManager.getEmployees().contains(testEmployee));
    }
}
