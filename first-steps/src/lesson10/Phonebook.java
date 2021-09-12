package lesson10;
/*
 * Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
 * искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
 * (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 * */

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();


    public ArrayList<String> add(String name, String phone) {
        ArrayList<String> phones = new ArrayList<>();

        if (phoneBook.containsKey(name)) {
            phones = phoneBook.get(name);
        }

        phones.add(phone);
        return phoneBook.put(name, phones);
    }


    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }


}
