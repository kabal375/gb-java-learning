package lesson11;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");


        String[] arr1 = {"1", "2", "3", "4", "5"};
        Integer[] arr2 = {11, 12, 13, 14, 15};

        ArrayOps<String> array1 = new ArrayOps<>(arr1);
        array1.swapElements(1, 2);
        System.out.println("1. String array: " + Arrays.toString(array1.getArray()));

        ArrayOps<Integer> array2 = new ArrayOps<>(arr2);
        array2.swapElements(1, 4);
        System.out.println("2. Int array: " + Arrays.toString(array2.getArray()));

        List<Integer> listInt = array2.getListFromArray();
        System.out.println("3. List from array: " + array2.getArray().getClass().getName() + " to " + listInt.getClass().getName());

    }

}
