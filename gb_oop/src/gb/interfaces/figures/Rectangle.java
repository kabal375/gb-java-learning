package gb.interfaces.figures;

public class Rectangle extends Polygon {
    public Rectangle(double sideA, double sideB) {

        //TODO validate parameters
        this.sides = new double[4];
        this.sides[0] = sideA;
        this.sides[1] = sideB;
        this.sides[2] = sideA;
        this.sides[3] = sideB;
    }

    @Override
    public double getArea() {
        double a = this.sides[0];
        double b = this.sides[1];

        return a * b;
    }
}
