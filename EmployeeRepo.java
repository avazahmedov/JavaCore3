import java.util.ArrayList;
import java.util.List;


public class EmployeeRepo {
    List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees(){
        return employees;
    }

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }


}
