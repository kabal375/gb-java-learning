package gb.generics.array;
import java.util.Arrays;
import java.util.Objects;


// <T> T[] toArray(T[] a)
public class CustomList<E> {

    private Object[] array;
    private int size;
    private static final int DEFAULT_SIZE = 10;
    private static final int DEFAULT_GROW_SIZE = 10;


    public CustomList(int initialCapacity) {
        this.array = new Object[initialCapacity];
        this.size = 0;
    }

    public CustomList() {
        this.array = new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public CustomList(E[] array) {
        this.array = array;
        this.size = array.length;
    }

    private void extendArray() {
        int oldLength = array.length;
        array = Arrays.copyOf(array, oldLength + DEFAULT_GROW_SIZE);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(E e) {
        if (array.length == size)
            extendArray();
        array[size] = e;
        size++;
        return true;
    }

    public void addAt(int index, E e) {
        if (array.length == size)
            extendArray();
        int newSize = size + 1;
        if (index < newSize)
            System.arraycopy(array, index, array, index + 1, newSize - index);
        array[index] = e;
        size++;
    }

    public Object get(int index) {
        Objects.checkIndex(index, size);
        return array[index];
    }


    public int indexOf(E e) {
        for (int i = 0; i < array.length; i++) {
            if (e.equals(array[i]))
                return i;
        }
        return -1;
    }

    public boolean contains(E e) {
        return indexOf(e) > -1;
    }

    private void removeElement(int index) {
        int newSize = size - 1;
        if (index < newSize)
            System.arraycopy(array, index + 1, array, index, newSize - index);
        array[newSize] = null;
        size = newSize;
    }

    public Object remove(int index) {
        Objects.checkIndex(index, size);
        Object value = array[index];
        removeElement(index);
        return value;
    }

    public void removeAll(E e) {
        boolean isFound = true;
        while (isFound) {
            isFound = false;
            for (int i = 0; i < size; i++) {
                if (e.equals(array[i])){
                    isFound = true;
                    removeElement(i);
                    break;
                }
            }
        }
    }

    public E set(int index, E e) {
        Objects.checkIndex(index, size);
        E oldValue = (E) array[index];
        array[index] = e;
        return oldValue;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(array, 0, size));
    }

    public <E extends Comparable<E>> E min() {
        E min = null;
        if (size > 0)
            min = (E) array[0];
        if (size > 1)
            for (int i = 1; i < size; i++) {
            min = ArrayOps.min(min, (E) array[i]);

        }
        return min;
    }

    public <E extends Comparable<E>> E max() {
        E max = null;
        if (size > 0)
            max = (E) array[0];
        if (size > 1)
            for (int i = 1; i < size; i++) {
                max = ArrayOps.max(max, (E) array[i]);

            }
        return max;
    }

    public <E extends Comparable> void bubbleSort() {

        try {
            ArrayOps.bubbleSort((E[]) array);
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }


    }


}
