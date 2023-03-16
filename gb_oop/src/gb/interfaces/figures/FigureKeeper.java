package gb.interfaces.figures;
// Создать класс-коллекцию фигур В классе-коллекции реализовать методы6
//         *1. Dывода информации о всех периметах, площадях и длиннах окружности всех фигур, где это возможно,
//         *2. добавления новой фигуры,
//         *3. удаления фигуры,
//         *4. изменения фигуры по ндексу,
//         *5. сортировки по площади, вывод информации о всех фигурах.

import java.util.ArrayList;
import java.util.Collections;

public class FigureKeeper {
    private ArrayList<TwoDimFigure> figures;

    public FigureKeeper() {
        this.figures = new ArrayList<>();
    }

    public void addFigure(TwoDimFigure figure) {
        figures.add(figure);
    }

    public void removeFigure(int index) {
        if (index < figures.size())
            figures.remove(index);
        else
            System.out.println("No figures at this index!");
    }

    public void replaceFigure(int index, TwoDimFigure newFigure) {
        if (index < figures.size())
            figures.set(index, newFigure);
        else
            System.out.println("No figures at this index!");
    }

    public void showInfoAll() {
        for (TwoDimFigure figure:
                figures) {
            System.out.println(figure.getClass().getName());

            if (figure instanceof Area) {
                System.out.println(((Area) figure).getArea());
            }
            if (figure instanceof Perimeter) {
                System.out.println(((Perimeter) figure).getPerimeter());
            }
            if (figure instanceof Circumference) {
                System.out.println(((Circumference) figure).getCircumference());
            }
        }
    }

    public void sortByArea(){
        Collections.sort(figures);
    }



}
