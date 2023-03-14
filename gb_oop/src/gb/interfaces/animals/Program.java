package gb.interfaces.animals;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.add(new Chicken(0.5, 1, "black"));
        zoo.add(new Stork(2.5, 5, "black"));
        zoo.add(new Tiger(2, 400, "black", "Africa", "10.11.2022"));
        zoo.add(new Wolf(0.5, 200, "black",
                "Siberia", "10.11.2022", true));
        zoo.add(new Cat(0.5, 4, "green", "Terry", "bengal",
                "black", "14.08.2018", true, true));
        zoo.add(new Dog(0.5, 8, "yellow", "Kira", "Border Collie",
                "brown", "14.08.2018", true, false));


        Scanner scanner = new Scanner(System.in);
        ZooUI.showMenu(zoo, scanner);

        zoo.flyAndTrain();

        scanner.close();
    }



}
