import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateEmployee createEmployee = new CreateEmployee();
        EmployeeRepo repo = new EmployeeRepo();
        Employee employee = createEmployee.addNewEmployee();
        Employee employee1 = createEmployee.addNewEmployee();
        repo.addEmployees(employee);
        repo.addEmployees(employee1);
        int res = employee.compareTo(employee1);
        employee.compareToString(res, employee1);
        Chief.raiseSalary(employee, 5000);
        Chief.raiseSalary(employee1, 10000);
        System.out.println(employee.getSalary());
        System.out.println(employee1.getSalary());
        List<Employee> employees = repo.getEmployees();
        System.out.println(employees);

    }
}
