package gb.interfaces.figures;

public class Rectangle extends Polygon {
    public Rectangle(double sideA, double sideB) throws InvalidArgsException {

        if (Validate.isPositive(sideA, sideB)) {
            this.sides = new double[4];
            this.sides[0] = sideA;
            this.sides[1] = sideB;
            this.sides[2] = sideA;
            this.sides[3] = sideB;
        } else throw new InvalidArgsException("Sides cannot be less or equal 0");
    }

    @Override
    public double getArea() {
        double a = this.sides[0];
        double b = this.sides[1];

        return a * b;
    }
}
