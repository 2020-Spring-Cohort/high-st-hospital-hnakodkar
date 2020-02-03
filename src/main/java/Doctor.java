
public class Doctor extends Employee implements Treatment {

    private String specialtyType = "Heart";
    Patient patient = new Patient("mark",10,20);
    public Doctor(String name, int Id, int salary, boolean payStatus) {
        super(name, Id, salary, payStatus);
        super.employeeType = "Doctor";
    }
    @Override
    public  void treatPatient(Patient patient) {
        patient.feelBetter(10);
    }
    @Override
    public void drawBlood(Patient patient) {

        patient.giveBlood(10);
    }

    public String getSpecialtyType() {
        return specialtyType;
    }




    @Override
    public String toString() {
        return "{" +
                "employeeType ='" + employeeType + '\'' +
                ", Name ='" + employeeName + '\'' +
                " specialtyType ='" + specialtyType + '\'' +
                ", Id =" + employeeId +
                ", Salary =" + employeeSalary +
                " payStatus =" + payStatus +
                '}';

    }
}
