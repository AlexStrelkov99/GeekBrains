package ru.lesson6;



public class Animal {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 2);
        cat.run(200);
        cat.jump(2);
        cat.swim(100);
        Dog dog = new Dog(500, 0.5);
        dog.run(500);
        dog.jump(0.5);
        dog.swim(10);
        Dog dog2 = new Dog(400, 0.5);
        dog2.run(400);
        Dog dog3 = new Dog(600, 0.5);
        dog3.run(600);

    }
    /*
    1. Создать классы Собака и Кот с наследованием от класса Животное.
            2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
            В качестве параметра каждому методу передается величина, означающая или длину препятствия
            (для бега и плавания), или высоту (для прыжков).
            3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
            прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
            4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат
            в консоль. (Например, dog1.run(150); -> результат: run: true)
            5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на
            бег может быть 400 м., у другой 600 м.

     */
   private final int distance;
   private final double height;

    public Animal(int distance, double height) {
        this.distance = distance;
        this.height = height;
    }

    public  void run(int distance){ }
    public  void swim(int distance){    }
    public  void jump(double height){
    }
}
