
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee underTest;

    @BeforeEach
    void setUp() {
        underTest = new Doctor("Kathy", 1, 500, false);
    }

    @Test
    public void shouldBeAbleToHaveName() {
        String result = underTest.getName();
        assertEquals("Kathy", result);
    }

    @Test
    public void shouldBeAbleToCreateEmployeeId() {
        Employee underTest = new Janitor("john", 1, 800, false);
        int result = underTest.getEmployeeId();
        assertEquals(1, result);
    }
    @Test
    public void shouldHaveSalary() {
        Employee underTest = new Doctor("Kathy", 2 ,12000, false);
        int salary = underTest.getSalary();
        assertEquals(12000, salary);
    }
    @Test
    public void employeeShouldKnowIfTheyAreNotPaid() {
        boolean payStatus = underTest.isPaid();
        assertFalse(payStatus);
    }
    @Test
    public void employeeShouldKnowIfTheyArePaid() {
        underTest.receivePay();
        boolean payStatus = underTest.isPaid();
        assertTrue(payStatus);
    }
    @Test
    public void receptionistIsNotOnThePhone() {
        Receptionist receptionist = new Receptionist("Jane", 121, 45000, false);
        boolean phoneStatus = receptionist.isOnThePhone();
        assertFalse(phoneStatus);
    }
  @Test
    public void receptionistIsOnThePhone() {
      Receptionist receptionist = new Receptionist("Jane", 121, 45000, false);
        receptionist.answeringPhone();
        boolean phoneStatus = receptionist.isOnThePhone();
        assertTrue(phoneStatus);
      System.out.println(phoneStatus);
    }
    @Test
    public void JanitorIsNotMopping() {
        Janitor janitor = new Janitor ("Bob",125,1500,false);
        boolean cleaningStatus = janitor.isMoppingFloors();
        assertFalse(cleaningStatus);
    }
    @Test
    public void JanitorIsMopping() {
        Janitor janitor = new Janitor ("Bob",125,1500,false);
        janitor.moppingFloors();
        boolean cleaningStatus = janitor.isMoppingFloors();
        assertTrue(cleaningStatus);
    }
}


