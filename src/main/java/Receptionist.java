public class Receptionist extends Employee {
    private boolean phoneStatus = false;

    public Receptionist(String name, int Id, int salary, boolean payStatus) {
        super(name, Id, salary, payStatus);
        super.employeeType = "Receptionist";
    }

    public boolean isOnThePhone() {
        return phoneStatus;
    }

    public void answeringPhone() {
        phoneStatus = true;
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