package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>{

    private List<T> fruits = new ArrayList<>();


    public float getWeight() {
        if (fruits.size() > 0) {
            return fruits.size() * fruits.get(0).getWeight();
        } else {
            return 0.0f;
        }
    }

//    public void addFruits(int number){
//        for (int i = 1; i <= number; i++) {
//            fruits.add(new T());
//        }
//    }

    public void addFruit(T fruit){ //Не забываем про метод добавления фрукта в коробку.
        fruits.add(fruit);
    }


    public List<T> getFruits() {
        return fruits;
    }

    public boolean compare(Box<? extends Fruit> anotherBox){
        return getWeight() == anotherBox.getWeight();

    }

    public void fillFrom(Box<T> anotherBox){  //метод, который позволяет пересыпать фрукты из текущей коробки в другу
        fruits.addAll(anotherBox.getFruits());
        anotherBox.clearBox();
    }

    public void clearBox() {
        fruits.clear();
    }
}
