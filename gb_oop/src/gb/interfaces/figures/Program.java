package gb.interfaces.figures;

public class Program {
    public static void main(String[] args) {

        FigureKeeper keeper = new FigureKeeper();
        try {
            keeper.addFigure(new Triangle(3, 2, 2));
            keeper.addFigure(new Rectangle(2, 4));
            keeper.addFigure(new Square(4));
            keeper.addFigure(new Circle(3));
        } catch (InvalidArgsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-- Initial state --");
        keeper.showInfoAll();
        keeper.sortByArea();
        System.out.println("-- Sorted by area --");
        keeper.showInfoAll();

    }
}
