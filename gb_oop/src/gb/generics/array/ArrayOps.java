package gb.generics.array;

public class ArrayOps {

    public static <E extends Comparable<E>> E max(E a, E b) {
        if (a == null) {
            if (b == null) return a;
            else return b;
        }
        if (b == null)
            return a;
        return a.compareTo(b) > 0 ? a : b;

    }
    public static <E extends Comparable<E>> E min(E a, E b) {
        if (a == null) {
            if (b == null) return a;
            else return b;
        }
        if (b == null)
            return a;
        return a.compareTo(b) < 0 ? a : b;
    }

    public static <E extends Comparable> void bubbleSort(E[] array) {
        E tmp = null;
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }
}
