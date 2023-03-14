package gb.interfaces.animals;

public abstract class Animal {
    protected double height;
    protected double weight;
    private String eyeColor;
    private String crySound;

    abstract void info();
    abstract void makeSound();

    public Animal(double height, double weight, String eyeColor, String crySound) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.crySound = crySound;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getCrySound() {
        return crySound;
    }


}
