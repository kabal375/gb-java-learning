package lesson11;

/*
* 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
* 2. Написать метод, который преобразует массив в ArrayList;
* */

import java.util.ArrayList;
import java.util.List;

public class ArrayOps<T> {

    private T[] array;


    public ArrayOps(T... array) {
        this.array = array;
    }


    public void swapElements(int i1, int i2) {

        try {
            T tempVar = array[i1];
            array[i1] = array[i2];
            array[i2] = tempVar;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("One or both elements are out of array");
        }
    }

    public List<T> getListFromArray() {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;

    }

    public T[] getArray() {
        return array;
    }

}
