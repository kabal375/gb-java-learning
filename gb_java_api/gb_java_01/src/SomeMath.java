import java.util.ArrayList;

public class SomeMath {
    public static void main(String[] args) {

        int n = 4;
        System.out.println("Треугольное число: " + triangleNumber(n));
        System.out.println("Факториал: " + factorial(n));

        System.out.println(simpleNumbers(1000));

    }

    public static int triangleNumber(int n) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n)
        if (n <= 0)
            return 0;
        if (n == 1) {
            return n;
        } else {
            return n + triangleNumber(n - 1);
        }
    }

    public static int factorial(int n) {
        // n! (произведение чисел от 1 до n)
        if (n <= 0)
            return 1;
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static ArrayList<Integer> simpleNumbers(int n) {
        // Вывести простые числа от 1 до 1000

        ArrayList<Integer> simpleNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isItSimple(i)) simpleNumbers.add(i);

        }

        return simpleNumbers;
    }

    public static boolean isItSimple(int n) {
        if (n <= 1) return false;
        else if (n <= 3) return true;
        else if (n % 2 == 0 || n % 3 == 0) return false;
        int m = 5;
        while (m * m <= n) {
            if (n % m == 0 || n % (m + 2) == 0) return false;
            m += 6;
        }
        return true;
    }

}
