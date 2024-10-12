package com.algonquin.cst8288.lab1.builder;

import com.algonquin.cst8288.lab1.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for EmployeeDirector to verify that it correctly constructs employees.
 */
public class EmployeeDirectorTest {

    @Test
    public void testConstructFullTimeEmployee() {
        EmployeeDirector director = new EmployeeDirector(new FullTimeEmployeeBuilder());
        Employee fullTimeEmployee = director.constructEmployee(1, "Jane Smith", "Finance", "Analyst", 40, 70000);

        assertEquals("Jane Smith", fullTimeEmployee.getName());
        assertEquals("Finance", fullTimeEmployee.getDepartment());
        assertEquals("Analyst", fullTimeEmployee.getRole());
        assertEquals(40, fullTimeEmployee.getWorkingHoursPerWeek());
        assertEquals(70000, fullTimeEmployee.getSalary(), 0);
    }

    @Test
    public void testConstructPartTimeEmployee() {
        EmployeeDirector director = new EmployeeDirector(new PartTimeEmployeeBuilder());
        Employee partTimeEmployee = director.constructEmployee(2, "John Doe", "Marketing", "Consultant", 20, 30000);

        assertEquals("John Doe", partTimeEmployee.getName());
        assertEquals("Marketing", partTimeEmployee.getDepartment());
        assertEquals("Consultant", partTimeEmployee.getRole());
        assertEquals(20, partTimeEmployee.getWorkingHoursPerWeek());
        assertEquals(30000, partTimeEmployee.getSalary(), 0);
    }
}
