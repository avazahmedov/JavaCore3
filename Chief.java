public class Chief extends Employee{


    public static
    void raiseSalary(Employee employee, int raiseAmount){
            if(employee instanceof Worker){
                int salary = employee.getSalary();
                salary += raiseAmount;
                employee.setSalary(salary);
            }
    }
}
