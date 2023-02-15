import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(LocalDateTime.now());

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Ваше имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);
        iScanner.close();
        System.out.println();

        int[] arr1 = new int[10];
        int[] arr2 = new int[] {1, 2, 3, 4, 5, 6};
        System.out.printf("Вывод на консоль по индексу: %d, %d", arr1[3], arr2[0]);
        System.out.println();
    }

}