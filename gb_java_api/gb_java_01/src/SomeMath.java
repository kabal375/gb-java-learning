public class SomeMath {
    public static void main(String[] args) {

        int n = 4;
        System.out.println("Треугольное число: " + triangleNumber(n));
        System.out.println("Факториал: " + factorial(n));

    }

    public static int triangleNumber(int n) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n)
        if (n == 1) {
            return n;
        } else {
            return n + triangleNumber(n - 1);
        }
    }

    public static int factorial(int n) {
        // n! (произведение чисел от 1 до n)
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

}
