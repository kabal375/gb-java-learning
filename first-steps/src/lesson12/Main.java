package lesson12;

/*
Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:
static final int SIZE = 10 000 000;
static final int HALF = size / 2;
float[] arr = new float[size].

2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:

arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));


5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).

Отличие первого метода от второго:
Первый просто бежит по массиву и вычисляет значения.
Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы
обратно в один.
*/


public class Main {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static float[] arr = new float[SIZE];


    public static void main(String[] args) {
        long a;

        ArrayProcessing arrDemo = new ArrayProcessing();
        arrDemo.fillWithOnes(arr);

        System.out.println("Linear processing...");
        a = System.currentTimeMillis();
        arrDemo.linearProcessing(arr);
        System.out.println("Done! It took " + (System.currentTimeMillis() - a) + " ms");
//        System.out.println(arr[0] + "/" + arr[5000001]);

        arrDemo.fillWithOnes(arr);

        System.out.println("Parallel processing...");
        a = System.currentTimeMillis();
        arrDemo.parallelProcessing(arr);
        System.out.println("Done! It took " + (System.currentTimeMillis() - a) + " ms");
//        System.out.println(arr[0] + "/" + arr[5000001]);



    }
}
