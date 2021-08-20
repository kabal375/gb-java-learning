package lesson5;
/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        Конструктор класса должен заполнять эти поля при создании объекта.
        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        Создать массив из 5 сотрудников.

        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
        "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
        С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван", "техник",
                "i.ivanov@mail.ru", "+7 555 431 32", 26);
        employees[1] = new Employee("Павлов Александр", "эксперт",
                "a.pavlov@mail.ru", "+7 555 431 33", 36);
        employees[2] = new Employee("Комаров Константин", "СЕО",
                "k.komarov@mail.ru", "+7 555 431 34", 48);
        employees[3] = new Employee("Алексей Феохари", "менеджер проектов",
                "a.feokhari@mail.ru", "+7 555 431 35", 32);
        employees[4] = new Employee("Косотраль Коль", "железный демон",
                "c.col@mail.ru", "+7 555 431 36", 100000);

        showInfoFilterAge(employees, 40);
    }

    public static void showInfoFilterAge(Employee[] arr, int age){
        for (Employee employee : arr) {
            if (employee.getAge() >= age) {
                employee.employeeInfo();
                System.out.println();
            }
        }
    }
}
