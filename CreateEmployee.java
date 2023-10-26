import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CreateEmployee {
    public Employee addNewEmployee() {
        Scanner sc = new Scanner(System.in);
        EmployeeRepo employeeRepo = new EmployeeRepo();
        System.out.println("Какого работника Вы хотите добавить?\n" +
                "1. Руководитель - 1\n" +
                "2. Сотрудник -2");
        int numClass = sc.nextInt();
        switch (numClass) {
            case 1:
                Chief chief = new Chief();
                System.out.println("Введите имя руководителя: ");
                String nameChief = sc.next();
                chief.setFirstName(nameChief);
                sc.nextLine();
                System.out.println("Введите фамилию руководителя:");
                String lastNameChief = sc.nextLine();
                chief.setLastName(lastNameChief);
                System.out.println("Введите позицию руководителя: ");
                String positionChief = sc.nextLine();
                chief.setPosition(positionChief);
                System.out.println("Введите номер телефона руководителя: ");
                String numberChief = sc.nextLine();
                chief.setPhoneNumber(numberChief);
                System.out.println("Введите зар плату руководителя: ");
                int salaryChief = sc.nextInt();
                chief.setSalary(salaryChief);
                System.out.println("Введите возраст руководителя: ");
                int ageChief = sc.nextInt();
                chief.setAge(ageChief);
                System.out.println("Введите дату рождения руководителя: ");
                System.out.println("Введите год рождения: ");
                int year = sc.nextInt();
                System.out.println("Введите месяц рождения: ");
                int month = sc.nextInt();
                System.out.println("Введите дату рождения: ");
                int day = sc.nextInt();
                LocalDate localDate = LocalDate.of(year, month, day);
                chief.setBirthDate(localDate);
                return chief;
            case 2:
                Worker worker = new Worker();
                System.out.println("Введите имя работника: ");
                String nameWorker = sc.next();
                worker.setFirstName(nameWorker);
                sc.nextLine();
                System.out.println("Введите фамилию работника:");
                String lastNameWorker = sc.nextLine();
                worker.setLastName(lastNameWorker);
                System.out.println("Введите позицию работника: ");
                String positionWorker = sc.nextLine();
                worker.setPosition(positionWorker);
                System.out.println("Введите номер телефона работника: ");
                String numberWorker = sc.nextLine();
                worker.setPhoneNumber(numberWorker);
                System.out.println("Введите зар плату работника: ");
                int salaryWorker = sc.nextInt();
                worker.setSalary(salaryWorker);
                System.out.println("Введите возраст работника: ");
                int ageWorker = sc.nextInt();
                worker.setAge(ageWorker);
                System.out.println("Введите дату рождения руководителя: ");
                System.out.println("Введите год рождения: ");
                int yearW = sc.nextInt();
                System.out.println("Введите месяц рождения: ");
                int monthW = sc.nextInt();
                System.out.println("Введите дату рождения: ");
                int dayW = sc.nextInt();
                LocalDate localDate1 = LocalDate.of(yearW, monthW, dayW);
                worker.setBirthDate(localDate1);
                return worker;
        }
        return null;
    }
}
