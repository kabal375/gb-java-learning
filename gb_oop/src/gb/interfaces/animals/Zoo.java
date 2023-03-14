package gb.interfaces.animals;

/*
реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь),
в котором организовать приватный массив объектов-животных со следующими методами:
* 1.Добавить животное в зоопарк(добавляет новое животное в структуру данных
* 2.Убирает животное с номером i из зоопарка
* 3.Посмотреть информацию о животном с номером i
* 4.Заставить животное с номером i издать звук
* 5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
* 6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
* */

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }

    public void remove(int i) {
        this.animals.remove(i);
    }

    public void getInfo(int i) {
        this.animals.get(i).info();
    }

    public void getSound(int i) {
        this.animals.get(i).makeSound();
    }

    public void getInfoAll() {
        for (int i = 1; i <= this.animals.size(); i++) {
            System.out.print(i + ". ");
            getInfo(i-1);
        }
    }

    public void getSoundAll() {
        for (Animal animal:
             this.animals) {
            animal.makeSound();
        }
    }

    public void flyAndTrain() {
                for (Animal animal:
             this.animals) {
            if (animal instanceof Fly)
                ((Fly) animal).fly();
            if (animal instanceof Train)
                ((Train) animal).train();
        }
    }

}
