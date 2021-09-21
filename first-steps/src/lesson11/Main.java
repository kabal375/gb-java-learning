package lesson11;

/*
Задача:
        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

        Для хранения фруктов внутри коробки можно использовать ArrayList;
        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
        которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
        Можно сравнивать коробки с яблоками и апельсинами;

        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

        Не забываем про метод добавления фрукта в коробку.
*/



import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");


        String[] arr1 = {"1", "2", "3", "4", "5"};
        Integer[] arr2 = {11, 12, 13, 14, 15};

        ArrayOps<String> array1 = new ArrayOps<>(arr1);
        array1.swapElements(1, 2);
        System.out.println("1. String array: " + Arrays.toString(array1.getArray()));

        ArrayOps<Integer> array2 = new ArrayOps<>(arr2);
        array2.swapElements(1, 4);
        System.out.println("2. Int array: " + Arrays.toString(array2.getArray()));

        List<Integer> listInt = array2.getListFromArray();
        System.out.println("3. List from array: " + array2.getArray().getClass().getName() + " to " + listInt.getClass().getName());


        System.out.println();
        System.out.println("FRUITS and BOXES");

        Box<Apple> box1 = new Box<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        System.out.println("Fruits count (apples): " + box1.getFruits().size());
        System.out.println("Box1's weight: " + box1.getWeight());

        Box<Orange> box2 = new Box<>();
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        System.out.println("Fruits count (oranges): " + box2.getFruits().size());
        System.out.println("Box2's weight: " + box2.getWeight());
        System.out.println();
        System.out.println("Compare box1 and box2: " + box1.compare(box2));

        Box<Apple> box3 = new Box<>();
        box3.addFruit(new Apple());
        box3.fillFrom(box1);
        System.out.println("Fruits count (box1 after dropping to box3): " + box1.getFruits().size());
        System.out.println("Box3's weight: " + box3.getWeight() + "/" + box3.getFruits().size());
        System.out.println("Compare box2 and box3: " + box2.compare(box3));
    }

}
