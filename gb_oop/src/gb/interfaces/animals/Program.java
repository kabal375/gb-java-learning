package gb.interfaces.animals;

public class Program {
    public static void main(String[] args) {

        Animal[] arr1 = new Animal[6];
        arr1[0] = new Chicken(0.5, 1, "black");
        arr1[1] = new Stork(2.5, 5, "black");
        arr1[2] = new Tiger(2, 400, "black", "Africa", "10.11.2022");
        arr1[3] = new Wolf(0.5, 200, "black",
                "Siberia", "10.11.2022", true);
        arr1[4] = new Cat(0.5, 4, "green", "Terry", "bengal",
                "black", "14.08.2018", true, true);
        arr1[5] = new Dog(0.5, 8, "yellow", "Kira", "Border Collie",
                "brown", "14.08.2018", true, false);
        for (Animal animal:
             arr1) {
            animal.makeSound();
            animal.info();
            if (animal instanceof Fly)
                ((Fly) animal).fly();
            if (animal instanceof Train)
                ((Train) animal).train();
        }

    }
}
