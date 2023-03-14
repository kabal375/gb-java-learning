package gb.interfaces.animals;

public abstract class Pet extends Animal {
    private String name;
    private String breed;
    private String furColor;
    private String birthday;
    protected boolean isVaccinated;
    abstract void showCaress();

    public Pet(double height, double weight, String eyeColor, String crySound, String name, String breed,
               String furColor, String birthday, boolean isVaccinated) {
        super(height, weight, eyeColor, crySound);
        this.name = name;
        this.breed = breed;
        this.furColor = furColor;
        this.birthday = birthday;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getBirthday() {
        return birthday;
    }
}
