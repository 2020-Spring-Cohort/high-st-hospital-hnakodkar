import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    public void doctorShouldHaveSpecialty() {
        Doctor underTest = new Doctor("John", 111, 8200, false);
        String specialtyType = underTest.getSpecialtyType();
        assertEquals("Heart", specialtyType);
    }
    @Test
    public void doctorShouldBeAbleToTreatPatient() {
        Patient patient = new  Patient ("John", 10, 20);
        Doctor doctor = new Doctor("Joe",121,95000,false);
        doctor.treatPatient(patient);
        int result = patient.getHealthLevel();
        assertEquals(30,result );
        System.out.println(result);
    }
    @Test
    public void doctorShouldBeAbleToDrawBlood() {
        Patient patient = new  Patient ("John", 20, 20);
        Doctor doctor = new Doctor("Joe",121,95000,false);
        doctor.drawBlood(patient);
        int result = patient.getBloodLevel();
        assertEquals(10,result );
        System.out.println(result);
    }

}