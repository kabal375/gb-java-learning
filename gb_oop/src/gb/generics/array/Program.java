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
        myList.set(0,"one");
        myList.addAt(1,"two");
        System.out.println(myList);
        System.out.println(myList.size());

        Integer[] arr = {1, 2, 3, 4};
        CustomList<Integer> myList2 = new CustomList<>(arr);
        System.out.println(myList2.size());
        System.out.println(myList2);

    }


}
