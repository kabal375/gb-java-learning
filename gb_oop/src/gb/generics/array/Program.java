package gb.generics.array;


public class Program {

    public static void main(String[] args) {

        CustomList<String> myList = new CustomList<>(5);
        myList.add("1");
        myList.add("true");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");

        for (int i = 0; i < myList.size(); i++) System.out.println(myList.get(i));
        System.out.println(myList.indexOf("3"));
        System.out.println(myList.contains("66"));
        System.out.println(myList.get(32));
    }


}
