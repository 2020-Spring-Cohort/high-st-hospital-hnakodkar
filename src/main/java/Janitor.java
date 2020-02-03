public class Janitor extends Employee{
    private boolean cleaningStatus = false;

    public Janitor(String name, int Id, int salary, boolean payStatus) {
        super(name, Id, salary, payStatus);
        super.employeeType = "Janitor";
    }

    public boolean isMoppingFloors() {
        return cleaningStatus;
    }

    public void moppingFloors() {
         cleaningStatus = true;
    }

    @Override
    public String toString() {
        return "{" +
                "employeeType ='" + employeeType + '\'' +
                ",Name='" + employeeName + '\'' +
                ", Id=" + employeeId +
                ", Salary=" + employeeSalary +
                " payStatus=" + payStatus +
                '}';
    }
}
