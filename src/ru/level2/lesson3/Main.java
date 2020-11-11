package ru.level2.lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать сколько раз встречается каждое слово.
    2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
     телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи.
     С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
     может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
    Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись
    добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем
    через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто
    из метода main() прописывая add() и get().
     */
    public static void main(String[] args) {
        String[] words = {
                "Первое",
                "Второе",
                "Третье",
                "Android1",
                "Django",
                "Java",
                "Android",
                "JavaScript",
                "LaTeX",
                "Android",
                "Linux",
                "Java",
                "php",
                "Java",
                "Mac",
                "java",
                "MySQL",
                "PHP",
                "PostgreSQL",
                "Python"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String word: words) {
            Integer res = hashMap.get(word);
            hashMap.put(word, res == null ? 1 : res + 1);
        }
        System.out.println(hashMap);
        PhoneBook1 phoneBook = new PhoneBook1();

        phoneBook.add("Иванов", "+79241112232");
        phoneBook.add("Иванов", "+79241112233");
        phoneBook.add("Петров", "+79241112234");
        phoneBook.add("Сидоров", "+79241112235");
        phoneBook.add("Александров", "+792411122888");
        phoneBook.add("Александров", "+79163901628");

        phoneBook.info();

        System.out.println(" У Александрова номера: " + phoneBook.get("Александров"));
    }
}

