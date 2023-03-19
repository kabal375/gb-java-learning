package gb.generics.array;


public class Program {

    public static void main(String[] args) {


        CustomList<String> myList = new CustomList<>(5);
        myList.add("1");
        myList.add("true");
        myList.add("true");
        myList.add("true");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");

        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.contains("66"));
        myList.removeAll("true");
        myList.set(0, "one");
        myList.addAt(1, "two");
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println("Minimum: " + myList.min().toString());
        System.out.println("Maximum: " + myList.max().toString());
        System.out.println(myList.size());
        myList.bubbleSort();


        Double[] arr = {1.5, 2.3, 3.0, 4.1, 5.0, 2.2};
        CustomList<Double> myList2 = new CustomList<>(arr);
        myList2.bubbleSort();
        System.out.println(myList2.size());
        System.out.println(myList2);

        System.out.println("Minimum: " + myList2.min().toString());
        System.out.println("Maximum: " + myList2.max().toString());


    }


}
