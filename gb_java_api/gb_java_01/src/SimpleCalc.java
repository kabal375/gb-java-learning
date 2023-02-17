import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {

        System.out.println("Введите простое выражение из двух чисел с операцией +, -, * или /");
        System.out.println("Например, '45.4 + 12.1' или '112 / 4'");
        String str = getString();

        System.out.println(calc(str));

    }

    public static String getString() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        return iScanner.nextLine().replace(" ", "");

    }

    public static double calc(String str) {
        if (str.contains("+")) {
            String[] parts = str.split("\\+");
            return Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
        } else if (str.contains("-")) {
            String[] parts = str.split("-");
            return Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
        } else if (str.contains("*")) {
            String[] parts = str.split("\\*");
            return Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
        } else if (str.contains("/")) {
            String[] parts = str.split("/");
            // TODO сделать проверку деления на 0
            return Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
        } else {
            System.out.println("Недопустимое выражение");
            return 0;
        }


    }

}
