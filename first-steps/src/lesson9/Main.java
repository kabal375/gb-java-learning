package lesson9;

/*
Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

        Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст
        вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке
        лежат неверные данные.

        В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
        и MyArrayDataException и вывести результат расчета.
*/


public class Main {

    public static void main(String[] args) {

        String[][] arraySymbol = {{"1", "2", "3", "p"},
                                  {"1", "2", "3", "4"},
                                  {"1", "2", "3", "4"},
                                  {"1", "2", "3", "4"}};

        String[][] arrayLong = {{"1", "2", "3", "4"},
                                {"1", "2", "3", "4"},
                                {"1", "2", "3", "4"},
                                {"1", "2", "3", "4", "5"}};

        String[][] arrayGood = {{"1", "2", "3", "4"},
                                {"1", "2", "3", "4"},
                                {"1", "2", "3", "4"},
                                {"1", "2", "3", "4"}};

        String[][][] setOfArrays = {arrayLong, arraySymbol, arrayGood};

        checkArrays(setOfArrays);


    }

    public static void checkArrays(String[][][] arrayOfArrays){
        for (String[][] array : arrayOfArrays) {
            try {
                System.out.println("Sum of elements: " + sumArrayElements(array));
            } catch (MyArraySizeException | MyArrayDataException e) {
                e.printStackTrace();
            }
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArrayDataException, MyArraySizeException{
        int sum = 0;
        int i = 0;

        if (array.length != 4) throw new MyArraySizeException("Array's size mismatch");

        for (String[] rows : array) {
            if (rows.length != 4) throw new MyArraySizeException("Array's string size mismatch (" + i + ")");

            String element;

            for (int j = 0; j < rows.length; j++) {
                element = rows[j];

                try {
                    sum += Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Element [" + i + "][" + j + "] is not a number", e);
                }
            }
            i++;

        }

        return sum;
    }

}
