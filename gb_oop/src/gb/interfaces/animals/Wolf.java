package gb.interfaces.animals;

public class Wolf extends WildAnimal{
    private boolean isPackLeader;

    public Wolf(double height, double weight, String eyeColor, String habitat, String whenSeen, boolean isPackLeader) {
        super(height, weight, eyeColor, "Hoooowl", habitat, whenSeen);
        this.isPackLeader = isPackLeader;
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
        return "Wolf{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyeColor=" + this.getEyeColor() +
                ", habitat=" + this.getHabitat() +
                ", whenSeen='" + whenSeen + '\'' +
                '}';
    }
}

