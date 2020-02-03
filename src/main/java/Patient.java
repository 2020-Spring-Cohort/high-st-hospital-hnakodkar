

public class Patient {

    String patientName;
    int bloodLevel;
    int healthLevel;


    public Patient( String name, int bloodLevel, int healthLevel) {
        this.patientName = name;
        this.bloodLevel = bloodLevel;
        this.healthLevel = healthLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }
    public void giveBlood(int amountDrawn) {
        bloodLevel -= amountDrawn;
    }
    public void feelBetter(int increasedHealthLevel) {
        healthLevel += increasedHealthLevel;
    }


}
