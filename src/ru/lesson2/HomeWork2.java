package ru.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
         /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
        [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++){
            if (a[i] == 0){
                a[i] = 1;
            }
            else{
                a[i] = 0;
            }
            System.out.print(a[i] + ", ");
        }
        System.out.println("");
         /*
        2. Задать пустой целочисленный массив размером 8. С помощью цикла
        заполнить его значениями 0 3 6 9 12 15 18 21;
         */
        int[] b = new int[8];
        for(int i = 0; i < b.length; i++){
            b[i] = i * 3;

            System.out.print(b[i] + ", ");
        }
        System.out.println("");
         /*
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        int[]c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < c.length; i++){
            if(c[i] < 6){
                c[i] = c[i] * 2;
            }
            System.out.print(c[i] + ", ");
        }
        System.out.println("");
         /*
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */
        int[][]d = new int[10][10];
        for(int i = 0; i < d.length; i++){
            for (int j = 0; j < d[i].length; j++) {
                if(i == j) {
                    d[i][i] = 1;
                }
                else{
                    d[i][i] = 0;
                }
                System.out.print(d[i][i]);
            }
            System.out.println();
        }
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

         /*
        7. **** Написать метод, которому на вход подается одномерный массив
        и число n (может быть положительным, или отрицательным), при этом
        метод должен сместить все элементымассива на n позиций. Для усложнения
        задачи нельзя пользоваться вспомогательными массивами.
        */
        int[] t = {1, 3, 5, 11, 4};
        int s = 23;
        massOffset(s, t);
    }
    static void massOffset (int n, int[]h){
        // int n = 23;
        // int[] h = {1, 3, 5, 11, 4};
        for (int i = 0; i < h.length; i++){
            h[i] = h[i] + n;
            System.out.println(h[i]);
        }
    }
}


