import lombok.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public abstract class Employee implements Comparable<Employee>{
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;


    @Override
    public String toString() {
        return "Работник: " +
                "Имя: '" + firstName + '\'' +
                ", Фамилия: '" + lastName + '\'' +
                ", Позиция: '" + position + '\'' +
                ", Номер телефона: '" + phoneNumber + '\'' +
                ", Зар плата: " + salary +
                ", Возраст: " + age + '\'' +
                ", Дата рождения: " + birthDate;
    }


    public int compareTo(Employee employee) {
        return getBirthDate().compareTo(employee.getBirthDate());

    }

    public void compareToString(int res, Employee employee1){
        if (res < 0) {
            System.out.println(getFirstName() + " старше " + employee1.getFirstName());
        } else if (res > 0) {
            System.out.println(employee1.getFirstName() + " старше " + getFirstName());
        }
        else System.out.println("Они равны по возрасту! ");
    }

}
