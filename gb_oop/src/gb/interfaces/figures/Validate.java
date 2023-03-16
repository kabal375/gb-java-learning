package gb.interfaces.figures;

public class Validate {

    public static boolean isPositive(double ... args) {
        boolean isValid = true;
        for (double arg:
             args) {
            if (arg <= 0) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public static boolean incorrectTriangleSides(double sideA, double sideB, double sideC) {
        return sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB;

    }
}
