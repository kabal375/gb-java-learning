package gb.generics.array;


public class ArrayOps {

    public static <E extends Comparable<? super E>> E max(E a, E b) {
        if (a == null) {
            if (b == null) return a;
            else return b;
        }
        if (b == null) return a;
        return a.compareTo(b) > 0 ? a : b;

    }

    public static <E extends Comparable<? super E>> E min(E a, E b) {
        if (a == null) {
            if (b == null) return a;
            else return b;
        }
        if (b == null) return a;
        return a.compareTo(b) < 0 ? a : b;
    }

    public static <E extends Comparable<? super E>> void bubbleSort(E[] array) {
        E tmp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    public static <E extends Comparable<? super E>> void selectionSort(E[] array) {
        E temp;
        for (int i = 0; i < array.length - 1; i++) {
            int minimal = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minimal]) < 0) {
                    minimal = j;
                }
            }
            temp = array[minimal];
            array[minimal] = array[i];
            array[i] = temp;
        }
    }

    public static <E extends Comparable<? super E>> void insertionSort(E[] array) {
        int j;
        E temp;
        for (int i = 1; i < array.length; i++) {
            j = i;
            while (j > 0 && array[j - 1].compareTo(array[j]) > 0) {
                temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
    }
}
