package ru.lesson2;

public class Task5 {
    public static void main(String[] args) {
        /*
        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        */
        int[] f = {1, 6, 4, 5, 10, 50, 11};
        int max = f[0];
        int min = f[0];
        for(int i = 0; i < f.length; i++){
            if(max < f[i]){
                max = f[i];
            }
        }
        System.out.println(max);
        for(int i = 0; i < f.length; i++){
        if(min > f[i]){
                min = f[i];
            }
        }
        System.out.println(min);
    }

}
