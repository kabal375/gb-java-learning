package gb.interfaces.figures;

import static java.lang.Math.PI;

public class Circle extends ClosedCurve implements Circumference {

    double r;

    public Circle(double r) throws InvalidArgsException {
        if (Validate.isPositive(r))
            this.r = r;
        else throw new InvalidArgsException("Radius can't be less or equal 0");
    }

    @Override
    public double getArea() {
        return PI * r * r ;
    }

    @Override
    public double getCircumference() {
        return 2 * PI * r;
    }
}
