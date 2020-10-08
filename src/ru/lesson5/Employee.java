package ru.lesson5;

public class Employee {
    /*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    4. Создать массив из 5 сотрудников.
            Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
    ...
    persArray[4] = new Person(...);
    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */
    String name;
    String surname;
    String patronymic;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("ФИО сотрудника: " + surname + " " + name+ " " + patronymic + "; Должность: " + position + "; email: " +
                email + "; телефон" + phone + "; зарплата: " + salary + "; Возраст: " + age);
    }
    void setAge(){
        if (age > 40)
            info();
         //  System.out.println("ФИО сотрудника: " + surname + " " + name+ " " + patronymic + "; Должность: " + position + "; email: " +
         //           email + "; телефон" + phone + "; зарплата: " + salary + "; Возраст: " + age);
    }




}
