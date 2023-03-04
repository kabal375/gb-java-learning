/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 *
 * Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
 * Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,
 * Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 *
 * Реализовать алгоритм пирамидальной сортировки (HeapSort)
 *
 ** На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 * */

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook;

    public PhoneBook() {

        this.phoneBook = new HashMap<>();
    }

    void add(String phone, String name) {
        this.phoneBook.put(phone, name);
    }

    void find(String name) {
        this.phoneBook.forEach((key, value) -> {
            if (value.toLowerCase().contains(name.toLowerCase()))
                System.out.printf("%s - %s \n", value, key);
        });
    }
}
