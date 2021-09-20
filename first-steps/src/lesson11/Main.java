package lesson11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");


        ArrayOps<String> array1 = new ArrayOps<>("1", "2", "3", "4", "5");
        array1.swapElements(1, 3);
        System.out.println(Arrays.toString(array1.getArray()));

    }

}
