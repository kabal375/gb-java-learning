package lesson5;

public class Employee {

    //ФИО, должность, email, телефон, зарплата, возраст.

    private String name;
    private String title;
    private String email;
    private String phone;
    private int age;

    public Employee(String name, String title, String email, String phone, int age) {
        this.name = name;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public void employeeInfo() {
        System.out.printf("ФИО: %s, возраст: %d, должность: %s %n", this.name, this.age, this.title);
        System.out.printf("Контакты: %s, %s %n", this.email, this.phone);
    }

    public int getAge() {
        return this.age;
    }

}
