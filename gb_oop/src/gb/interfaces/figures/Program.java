package gb.interfaces.figures;

public class Program {
    public static void main(String[] args) {

        TwoDimFigure[] arr1 = {new Triangle(2, 2, 2),
                            new Rectangle(2, 4),
                            new Square(3),
                            new Circle(1)};

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
