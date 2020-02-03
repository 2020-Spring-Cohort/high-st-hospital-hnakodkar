public class Nurse extends Employee implements Treatment {

    public Nurse(String name, int Id, int salary, boolean payStatus) {
        super(name, Id, salary, payStatus);
        super.employeeType = "Nurse";
    }


    public void drawBlood(Patient patient) {

        patient.giveBlood(5);
    }

    @Override
    public void treatPatient(Patient patient) {
        patient.feelBetter(5);
    }

    @Override
    public String toString() {
        return "{" +
                "employeeType ='" + employeeType + '\'' +
                ",Name ='" + employeeName + '\'' +
                ", Id =" + employeeId +
                ", Salary =" + employeeSalary +
                " payStatus =" + payStatus +
                '}';
    }

}