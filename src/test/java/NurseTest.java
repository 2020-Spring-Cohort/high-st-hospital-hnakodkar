import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    @Test
    public void nurseShouldBeAbleToDrawBlood() {
        Patient patient = new Patient("",20,20);
        Nurse nurse = new Nurse("Jane",110,50000,false);
        nurse.drawBlood(patient);
        int result = patient.getBloodLevel();
        assertEquals(15, result);
        System.out.println(result);
    }
    @Test
    public void nurseShouldBeAbleToTreatPatient() {
        Patient patient = new Patient("",20,20);
        Nurse nurse = new Nurse("Jane",110,50000,false);
        nurse.treatPatient(patient);
        int result = patient.getHealthLevel();
        assertEquals(25, result);
        System.out.println(result);
    }
}
