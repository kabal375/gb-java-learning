package gb.interfaces.figures;

abstract class TwoDimFigure implements Area, Comparable<TwoDimFigure> {
    @Override
    public int compareTo(TwoDimFigure o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
