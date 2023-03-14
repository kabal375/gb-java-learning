package gb.interfaces.animals;

public class Chicken extends Bird implements Fly {


    public Chicken(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor, "cha-caw", 0);
    }

    @Override
    void info() {
        System.out.println(this);
    }

    @Override
    void makeSound() {
        System.out.println(this.getCrySound());
    }

    @Override
    public void fly() {
        System.out.println("I can't fly. I'm jumping");
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyeColor=" + this.getEyeColor() +
                ", altitude=" + this.getAltitude() +
                '}';
    }
}
