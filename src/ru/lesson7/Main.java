package ru.lesson7;

import java.util.Scanner;

public class Main {
           /*
1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
     */
        public static void main(String[] args)
        {
            Cat[] cats = new Cat[5];
            cats[0] = new Cat("Dusya", 5);
            cats[1] = new Cat("Murzik", 25);
            cats[2] = new Cat("Myshkin", 10);
            cats[3] = new Cat("Pasha", 15);
            cats[4] = new Cat("Grom", 30);


            Plate plate = new Plate(20);

            for (int cat = 0; cat < cats.length; cat++)
            {
                cats[cat].eat(plate);
                plate.countEatInPlate();
            }

            appendFoodTo(plate);

            for (int cat = 0; cat < cats.length; cat++)
            {
                cats[cat].eat(plate);
                plate.countEatInPlate();
            }


        }

        static void appendFoodTo(Plate plate)
        {
            System.out.println("Добавляем еду в тарелку");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество еды");
            int food = scanner.nextInt();

            plate.increaseFood(food);
        }



    }

