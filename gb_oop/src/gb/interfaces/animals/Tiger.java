package gb.interfaces.animals;

public class Tiger extends WildAnimal{

    public Tiger(double height, double weight, String eyeColor, String habitat, String whenSeen) {
        super(height, weight, eyeColor, "RAAAWRR", habitat, whenSeen);
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
    public String toString() {
        return "Tiger{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyeColor=" + this.getEyeColor() +
                ", habitat=" + this.getHabitat() +
                ", whenSeen='" + whenSeen + '\'' +
                '}';
    }
}
