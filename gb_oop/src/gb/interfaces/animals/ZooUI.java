package gb.interfaces.animals;

import java.util.Random;
import java.util.Scanner;

public class ZooUI {

    public static void showMenu(Zoo zoo, Scanner scanner) {
        int item = 0;

        while (item != 7) {
            System.out.println("-= Choose a command: =- ");
            System.out.println("1 - Add animal to the Zoo");
            System.out.println("2 - Remove animal from the Zoo");
            System.out.println("3 - Get info about an animal");
            System.out.println("4 - Get info about all the animals");
            System.out.println("5 - Make an animal make a sound");
            System.out.println("6 - Make all the animals make sounds");
            System.out.println("7 - Exit");

            try {
                item = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input!!! Enter number 1-6");
                item=0;
            }

            switch (item) {
                case 1 -> zoo.add(new Wolf(0.5, (new Random()).nextInt(150, 250), "black",
                        "Siberia", "10.11.2022", false));
                case 2 -> zoo.remove(getIndex(scanner) - 1);
                case 3 -> zoo.getInfo(getIndex(scanner) - 1);
                case 4 -> zoo.getInfoAll();
                case 5 -> zoo.getSound(getIndex(scanner) - 1);
                case 6 -> zoo.getSoundAll();
                case 7 -> {
                }
            }
        }
    }

    public static int getIndex(Scanner scanner) {
        int i = 0;
        System.out.println("Enter index of the animal:");
        try {
            i = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input!!!");
        }
        return i;
    }
}
