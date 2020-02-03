
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class HospitalTest {


   // @BeforeEach
    //void setUp() {
       // Hospital underTest = new Hospital();
       // Employee testEmployee = new Employee("jane", 123, 1200);
       // underTest.hireEmployees(testEmployee);
   // }

    @Test
    public void shouldBeAbleToHireEmployee() {
        Employee testEmployee = new Employee("Mark",125,90000,false);
        assertEquals("Mark", testEmployee.getName());
    }

    @Test
    public void shouldBeAbleToMakeArrayOfAllEmployees() {
        Hospital allEmployees = new Hospital();
        Employee testEmployee = new  Doctor("jane", 123, 1200,false);
        Employee testEmployee2 = new Janitor("mary", +  113, 1500, false);
        allEmployees.hireEmployees(testEmployee);
        allEmployees.hireEmployees(testEmployee2);
        ArrayList<Employee> retrieveEmployees = allEmployees.retrieveEmployeeList();
        assertEquals(2, retrieveEmployees.size());
    }
    @Test
    public void shouldBeAbleToRetrieveAllEmployeesAndStatus() {
        Employee test1 = new Doctor ("joe",111,90000, false);
        Employee test2 = new Receptionist("Mary",125,45000, false);
        Employee test3 = new Janitor("jim",136,10000, false);
        Hospital hospitalUnderTest = new Hospital();
        hospitalUnderTest.addEmployee(test1);
        hospitalUnderTest.addEmployee(test2);
        hospitalUnderTest.addEmployee(test3);
        ArrayList<Employee>employeeList = hospitalUnderTest.retrieveEmployeeList();
        hospitalUnderTest.printAllEmployees();
        System.out.println(test1.getName());
    }

    @Test
    public void shouldBeAbleToPayAllEmployees() {
        Employee test1 = new Doctor("mark", 121, 90000, false);
        Hospital hospitalUnderTest = new Hospital();
        hospitalUnderTest.addEmployee(test1);
    }
    @Test
    public void employeeShouldNotBePaidUntilReceivePay_notPaid(){
        Employee employee = new Employee("Mary",110,90000,false);
        boolean result = employee.isPaid();

    }

}