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

    private Object[] extendArray() {
        int oldLength = array.length;
        return array = Arrays.copyOf(array, oldLength + DEFAULT_GROW_SIZE);
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

    public Object remove(int index) {
        // TODO
        return null;
    }

//------------------------------




    public boolean remove(Object o) {
        return false;
    }



    public Object set(int index, Object element) {
        return null;
    }


    public void add(int index, Object element) {

    }


}
