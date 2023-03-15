package gb.interfaces.figures;

import static java.lang.Math.PI;

public class Circle extends ClosedCurve implements Circumference {

    double r;

    public Circle(double r) {
        // TODO validate parameters
        this.r = r;
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
