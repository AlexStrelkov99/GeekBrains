package ru.level2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook1 {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String tel) {
        ArrayList<String> telList = phoneBook.get(name);
        if (telList == null) telList = new ArrayList<>();
        telList.add(tel);
        phoneBook.put(name, telList);
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }

    public void info() {
        System.out.println(phoneBook);
    }
}
