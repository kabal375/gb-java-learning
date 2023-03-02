import java.util.*;

public class HomeWork5 {

    public static void main(String[] args) {

    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("+7(995)-000-00-01", "Иванов Иван");
        phoneBook.add("+7(995)-000-00-02", "Плющенкова Алёна");
        phoneBook.add("+7(995)-000-00-03", "Конашенков Игорь");
        phoneBook.add("+7(995)-000-01-01", "Иванова Света");
        phoneBook.add("+7(499)-123-01-01", "Иванова Света");
        phoneBook.add("+3(490)-000-01-01", "Иванова Света");
        phoneBook.add("+7(995)-000-02-01", "Бондаренко Игорь");
        phoneBook.add("+7(995)-000-03-01", "Разумов Сергей");

        phoneBook.find("ива");
        System.out.println();

    /*  Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
    * Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,
    * Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
    * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    * Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.*/

        String names = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, " +
                "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, " +
                "Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] arrNames = names.split(", ");

        getNameCounts(arrNames);

    }

    public static void getNameCounts(String[] namesArray) {

        Map<String, Integer> nameCounts = new HashMap<>(); // Используем хэшмапу для подсчёта
        for (String fullName:
             namesArray) {
            String name = fullName.split(" ")[0];
            if (nameCounts.containsKey(name)) {
                nameCounts.put(name, nameCounts.get(name) + 1);
            }
            else {
                nameCounts.put(name, 1);
            }
        }
//        System.out.println(nameCounts);

        // Переносим в TreeMap в соответствии с заданием
        Map<Integer, List<String>> sortedResult = new TreeMap<>(Collections.reverseOrder());
        nameCounts.forEach((key, value) -> {
            if (sortedResult.containsKey(value)) {
                sortedResult.get(value).add(key);
            } else {
                List<String> list = new ArrayList<>();
                list.add(key);
                sortedResult.put(value, list);
            }
        });
        System.out.println(sortedResult);
    }
}
