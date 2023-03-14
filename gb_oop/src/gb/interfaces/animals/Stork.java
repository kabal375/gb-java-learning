package gb.interfaces.animals;

public class Stork extends Bird implements Fly {


    public Stork(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor, "*hissing*", 4800);
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
        System.out.println("I'm flying at " + this.getAltitude() + " meters");
    }

    @Override
    public String toString() {
        return "Stork{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyeColor=" + this.getEyeColor() +
                ", altitude=" + this.getAltitude() +
                '}';
    }
}
