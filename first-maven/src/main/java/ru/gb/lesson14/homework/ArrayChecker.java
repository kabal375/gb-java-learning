package ru.gb.lesson14.homework;

public class ArrayChecker {


    /*
    Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
    Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
    идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
    иначе в методе необходимо выбросить RuntimeException.
    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
    Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
    */

    public static int[] getNumbersAfterLast4(int[] array){
        int index = -1;
        int[] newArr;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                index = i + 1;
                break;
            }
        }
        if (index == -1) throw new RuntimeException();

        newArr = new int[array.length - index];

        if (newArr.length > 0) {
            System.arraycopy(array, index, newArr, 0, array.length - index);
        }

        return newArr;

    }

    /*
    Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
    то метод вернет false;
    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
    [ 1 1 1 4 4 1 4 4 ] -> true
    [ 1 1 1 1 1 1 ] -> false
    [ 4 4 4 4 ] -> false
    [ 1 4 4 1 1 4 3 ] -> false
    */

    public static boolean checkArrayFor1and4(int[] array) {
        boolean isOne = false;
        boolean isFour = false;
        boolean OtherNumbers = false;

        for (int n : array) {
            switch (n) {
                case 1 :
                    isOne = true;
                    break;
                case 4 :
                    isFour = true;
                    break;
                default:
                    OtherNumbers = true;
                    break;
            }

            if (OtherNumbers) break;
        }

        return isOne && isFour && !OtherNumbers;
    }

}
