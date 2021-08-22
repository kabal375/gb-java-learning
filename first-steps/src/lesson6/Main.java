package lesson6;

/*
Создать классы Собака и Кот с наследованием от класса Животное.
        Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль.
        (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

        У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
        плавание: кот не умеет плавать, собака 10 м.).
        * Добавить подсчет созданных котов, собак и животных.
*/


public class Main {




    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик");
        dog1.run(300);
        dog1.run(600);
        dog1.swim(5);

        Cat cat1 = new Cat("Мурзик");
        cat1.run(100);
        cat1.run(600);
        cat1.swim(5);

        Cat cat2 = new Cat("Рыжик");
        cat2.swim(5);

        System.out.println("Всего животных: " + cat1.getAnimalCount());
        System.out.println("Собак: " + dog1.getDogCount());
        System.out.println("Кошек: " + cat2.getCatCount());


    }


}
