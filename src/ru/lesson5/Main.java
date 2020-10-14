package ru.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Николаев", "Игорь", "Владимирович", "инженер", "123@mail.ru",
                "22222", 5000, 45 );
        employees[1] = new Employee("Егоров", "Игорь", "Владимирович", "экономист", "123@mail.ru",
                "22222", 3000, 35 );
        employees[2] = new Employee("Никитин", "Игорь", "Владимирович", "инженер", "123@mail.ru",
                "22222", 2000, 25 );
        employees[3] = new Employee("Дубовая", "Татьяна", "Андреевна", "начальник отдела", "123@mail.ru",
                "22222", 5500, 42 );
        employees[4] = new Employee("Агеева", "Яна", "Владимировна", "лаборант", "123@mail.ru",
                "22222", 1000, 37 );

        System.out.println("Информация о всех сотрудниках");
        for(int i = 0; i < employees.length; i++){
            employees[i].info();
        }
        System.out.println("Информация о сотрудниках, которым более 40 лет");
        for(int i = 0; i < employees.length; i++){
            employees[i].setAge();
        }

    }


}
