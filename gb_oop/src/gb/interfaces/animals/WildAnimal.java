package gb.interfaces.animals;

public abstract class WildAnimal extends Animal {
    private String habitat;
    protected String whenSeen;

    public WildAnimal(double height, double weight, String eyeColor, String crySound, String habitat, String whenSeen) {
        super(height, weight, eyeColor, crySound);
        this.habitat = habitat;
        this.whenSeen = whenSeen;
    }

    public String getHabitat() {
        return habitat;
    }
}
