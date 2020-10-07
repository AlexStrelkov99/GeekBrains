package ru.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        /*
        1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю
        дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить
        больше ли указанное пользователем число чем загаданное, или меньше. После победы
        или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        */
        System.out.println("Угадайте число от 0 до 9");

       guessNumber();

      // rePlay();


    }
    public static void guessNumber(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        for (int i = 0; i < 3; i++) {
            Scanner inputNumber = new Scanner(System.in);
            int number = inputNumber.nextInt();
            if (number == randomNumber) {
                System.out.println("Вы угадали число");
                rePlay();
                break;
            }
            if (number > randomNumber) {
                System.out.println("Вы ввели число больше чем загаданное. Попробуйте еще раз");
            }
            if (number < randomNumber) {
                System.out.println("Вы ввели число меньше чем загаданное. Попробуйте еще раз");
            }
        }
       System.out.println("Вы проиграли");
        rePlay();
    }

    public static void rePlay() {
        System.out.println("Повторить игру еще раз, 1 – да / 0 – нет?");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();
        if(number == 1 ){
            guessNumber();
        }
        if(number == 0){
            System.out.println("Конец игры");
        }
    }
}
