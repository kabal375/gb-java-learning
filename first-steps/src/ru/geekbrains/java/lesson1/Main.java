package ru.geekbrains.java.lesson1;

import java.util.Arrays;

/*
1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;

2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами;

5 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если
в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница
показана символами ||, эти символы в массив не входят.

7 **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
*/


public class Main {

    public static void main(String[] args) {

	// write your code here


        System.out.println("1. Замена символов в массиве");
        int[] arr1 = {0, 0, 1, 1, 0};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(replaceBinary(arr1)));
        System.out.println();

        System.out.println("2. Заполнить пустой массив");
        fillArray();
        System.out.println();

        System.out.println("3. Умножить элементы меньше 6 в массиве на 2");
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(multiplyElements(arr3, 6,2)));
        System.out.println();

        System.out.println("4. Создать квадратный массив с единицами по диагонали");

        createIdentityMatrix(5);
        System.out.println();

        System.out.println("5. Найти min и max элементы массива");
        int[] arr5 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println(Arrays.toString(arr5));
        int[] minMax = findMinMax(arr5);
        System.out.println("Min = " + minMax[0]);
        System.out.println("Max = " + minMax[1]);

        System.out.println();


        System.out.println("6. Проверить, бьётся ли массив на две равные суммы элементов");
        int[] arr6 = { 2, 4, 4, 1, 2, 2, 10, 1 };
        System.out.println(Arrays.toString(arr6));
        System.out.println(checkBalance(arr6));
        System.out.println();

        System.out.println("7. Сдвиг массива");
        int[] arr7 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(shiftArray(arr7, 2)));

        System.out.println();
    }

    public static int[] replaceBinary(int[] arr) {
       /*
        1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1:
                    arr[i] = 0;
                    break;
                case 0:
                    arr[i] = 1;
                    break;
            }
        }
        return arr;
    }

    public static void fillArray() {
/*
        2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
*/
        int[] arr2 = new int[8];
        for (int i = 0, n = 0; i < arr2.length; i++, n+=3) {
            arr2[i] = n;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] multiplyElements(int[] arr, int n, int m) {
/*
        3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        n -- если элемент меньше n, он будет умножен;
        m -- множитель
*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n) {
                arr[i] *= m;
            }
        }

        return arr;
    }

    public static void createIdentityMatrix(int dimension) {
      /*
      4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
      и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

        int[][] arr = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    if (i == j) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static int[] findMinMax(int[] arr) {
        // здесь могло быть условие на проверку наличия хотя бы одного элемента в массиве
        int min = arr[0];
        int max = arr[0];
        for (int n : arr) {
            if (min > n)  min = n;
            if (max < n) max = n;
        }
        return new int[] { min, max };
    }

    public static boolean checkBalance(int[] arr) {
/*    6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница
    показана символами ||, эти символы в массив не входят.
    */
        int lsum = 0;
        int rsum;
        for (int i = 0; i < arr.length; i++) {
            lsum += arr[i];
            rsum = 0;
            for (int j = i+1; j < arr.length; j++) {
                rsum += arr[j];
            }
            if (rsum == lsum) {
                System.out.println(lsum + " till i = " + i);
                return true;
            }
        }
        return false;

    }

    public static int[] shiftArray(int[] arr, int shiftN) {
/*        7 **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        Элементы смещаются циклично.
        Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
        [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        При каком n в какую сторону сдвиг можете выбирать сами.
*/
        if (shiftN == 0) return arr;

        if (shiftN > 0) { // shift right
            for (int i = 1; i <= shiftN; i++) {
                shiftArrayRight(arr);
            }
        }
        if (shiftN < 0) { // shift left
            for (int i = -1; i >= shiftN; i--) {
                shiftArrayLeft(arr);
            }
        }
        return arr;

    }

    public static int[] shiftArrayRight(int[] arr) {
        int x = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
        return arr;
    }

    public static int[] shiftArrayLeft(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = x;
        return arr;
    }

}
