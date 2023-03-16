package gb.interfaces.figures;

import java.util.Arrays;

abstract class Polygon extends TwoDimFigure implements Perimeter {
    protected double[] sides;

    @Override
    public double getPerimeter() {
        return Arrays.stream(sides).sum();
    }
}
