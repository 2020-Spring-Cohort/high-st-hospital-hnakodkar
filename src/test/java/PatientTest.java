import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {


    @Test
    public void patientShouldHaveName() {
        Patient test = new Patient("mark", 20, 10);
        String result = test.patientName;
        assertEquals("mark", result);
    }
    @Test
    public void patientShouldHaveDefaultBloodLevelOf20() {
        Patient test = new Patient("mark", 20,10);
        int result = test.bloodLevel;
        assertEquals(20, result);

    }

    @Test
    public void patientShouldHaveDefaultHealthLevelOf10() {
        Patient test = new Patient("mark", 10,20);
        int result = test.healthLevel;
        assertEquals(20, result);

    }

}
