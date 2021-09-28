package ru.gb.lesson14;

public class MathOperations {
    static int sum(int a, int b) {
        return a + b;
    }

    static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    static double pow2(double value){
        return Math.pow(value, 2);
    }

}
