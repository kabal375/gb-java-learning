package lesson10;

/*
* 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
*    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
*    Посчитать, сколько раз встречается каждое слово.
*
  2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
  * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
  * искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
  * (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
  * Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие
  * с пользователем через консоль и т.д).
  * Консоль использовать только для вывода результатов проверки телефонного справочника.
  *
*/


public class Main {

    public static void main(String[] args) {

        System.out.println("1. Words count");
        System.out.println("-----------------");

        String[] words = {
                "test", "root", "gas", "gun", "moreover", "task", "Lord", "crown", "dream",
                "shadow", "root", "flame", "dream", "night", "light", "dream", "cost",
                "falcon", "light", "shadow", "dream", "drama", "war", "tree", "pain"
        };

        WordsCalculator wc = new WordsCalculator(words);

        System.out.println("There are " + wc.getUniqueWordsNumber() + " unique words:");
        wc.printUniqueWords();

        System.out.println();
        System.out.println("Word counts:");
        wc.printWordsCount();

        System.out.println();
        System.out.println("2. Phonebook");
        System.out.println("-----------------");

        Phonebook pb = new Phonebook();

        pb.add("Doe", "123");
        pb.add("Seth", "124");
        pb.add("Seth", "125");
        System.out.println("Phones for Doe: " + pb.get("Doe"));
        System.out.println("Phones for Seth: " + pb.get("Seth"));


    }

}
