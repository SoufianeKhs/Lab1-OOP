package com.algonquin.cst8288.lab1.factory;

import com.algonquin.cst8288.lab1.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for EmployeeFactory to ensure it correctly creates different employee types.
 */
public class EmployeeFactoryTest {

    @Test
    public void testCreateFullTimeEmployee() {
        Employee fullTimeEmployee = EmployeeFactory.createEmployee("fulltime");

        assertNotNull("Full-time employee should be created", fullTimeEmployee);
        assertEquals("FullTimeEmployee", fullTimeEmployee.getClass().getSimpleName());
    }

    @Test
    public void testCreatePartTimeEmployee() {
        Employee partTimeEmployee = EmployeeFactory.createEmployee("parttime");

        assertNotNull("Part-time employee should be created", partTimeEmployee);
        assertEquals("PartTimeEmployee", partTimeEmployee.getClass().getSimpleName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalidEmployeeType() {
        EmployeeFactory.createEmployee("intern");
    }
}
