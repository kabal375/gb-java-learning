package gb.interfaces.figures;

abstract class TwoDimFigure implements Area, Comparable {
    @Override
    public int compareTo(Object o) {
        if (this.getArea() > ((TwoDimFigure) o).getArea())
            return 1;
        else if (this.getArea() < ((TwoDimFigure) o).getArea())
            return -1;
        else
            return 0;
    }
}
