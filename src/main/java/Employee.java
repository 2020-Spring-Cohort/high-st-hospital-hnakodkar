//import java.util.HashMap;

public class Employee {
    String employeeName;
    int employeeId;
    int employeeSalary;
    String employeeType;
    boolean payStatus = false;
    boolean employeePayStatus;



    public Employee(String name, int Id, int salary, boolean payStatus) {
        this.employeeName = name;
        this.employeeId = Id;
        this.employeeSalary = salary;
        this.employeePayStatus = payStatus;
    }

    public String getName() {
        return employeeName;
    }

    public int getEmployeeId() {

        return employeeId;
    }

    public int getSalary() {
        return employeeSalary;
    }

    public String getEmployeeType()
    {
        return employeeType;
    }

    public boolean isPaid() {
        return payStatus;
    }

    public void receivePay() {
         payStatus = true;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "employeeName='" + employeeName + '\'' +
//                ", employeeId=" + employeeId +
//                ", employeeSalary=" + employeeSalary +
//                ", employeeType='" + employeeType + '\'' +
//                ", payStatus=" + payStatus +
//                ", employeePayStatus=" + employeePayStatus +
//                '}';
//    }
}


