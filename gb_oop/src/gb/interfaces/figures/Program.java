package gb.interfaces.figures;

public class Program {
    public static void main(String[] args) {

        TwoDimFigure[] arr1 = new TwoDimFigure[0];
        try {
            arr1 = new TwoDimFigure[]{new Triangle(3, 2, 2),
                                new Rectangle(2, 4),
                                new Square(4),
                                new Circle(3)};
        } catch (InvalidArgsException e) {
            System.out.println(e.getMessage());
        }

        for (TwoDimFigure figure:
             arr1) {
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
}
