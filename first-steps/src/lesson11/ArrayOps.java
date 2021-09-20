package lesson11;

public class ArrayOps<T> {

    private T[] array;


    public ArrayOps(T... array) {
        this.array = array;
    }


    public void swapElements(int i1, int i2) {
        T tempVar = array[i1];
        array[i1] = array[i2];
        array[i2] = tempVar;
    }

    public T[] getArray() {
        return array;
    }

}
