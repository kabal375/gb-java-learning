package gb.interfaces.figures;

import static java.lang.Math.sqrt;

public class Triangle extends Polygon {

    public Triangle(double sideA, double sideB, double sideC) {

        //TODO validate parameters
        this.sides = new double[3];
        this.sides[0] = sideA;
        this.sides[1] = sideB;
        this.sides[2] = sideC;

    }

    @Override
    public double getArea() {
        //S = √p(p - a)(p - b)(p - c)
        double a = this.sides[0];
        double b = this.sides[1];
        double c = this.sides[2];
        double p = this.getPerimeter();

        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
