import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {


    public HashMap<String, Employee> employeeList = new HashMap<>();

    public void hireEmployees(Employee testEmployee) {
        employeeList.put(testEmployee.getName(), testEmployee);

    }

    public ArrayList<Employee> retrieveEmployeeList() {

        return new ArrayList<>(employeeList.values());
    }

    public void addEmployee(Employee testEmployee) {

        employeeList.put(testEmployee.getName(), testEmployee);
    }

    public void printAllEmployees() {
        System.out.println("| - NAME - | - ID - | - Salary- | - Type - | - Pay Status - |");
        System.out.println(" -------------------------------------------------------------------------------");
        for (Employee employee : employeeList.values()) {
            System.out.printf("| - " + employee.getName() +
                    " - | - " + employee.getEmployeeId() +
                    " - | - " + employee.getSalary() +
                    " - | - " + employee.getEmployeeType() +
                    " - | -   " + employee.isPaid() +
                    " - |");
            System.out.println("\n");
        }

    }

}