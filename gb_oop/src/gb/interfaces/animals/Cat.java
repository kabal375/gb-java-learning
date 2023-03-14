package gb.interfaces.animals;

public class Cat extends Pet {

    private final boolean isFurred;

    public Cat(double height, double weight, String eyeColor, String name, String breed,
               String furColor, String birthday, boolean isVaccinated, boolean isFurred) {
        super(height, weight, eyeColor, "Meow, meow", name, breed, furColor, birthday, isVaccinated);
        this.isFurred = isFurred;
    }


    @Override
    void info() {
        System.out.println(this);
    }

    @Override
    void makeSound() {
        System.out.println(getCrySound());
    }

    @Override
    void showCaress() {
        System.out.println("*purrrrrrrr*");
    }

    public boolean isFurred() {
        return isFurred;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyeColor=" + getEyeColor() +
                ", name=" + getName() +
                ", breed=" + getBreed() +
                ", isFurred=" + isFurred +
                ", furColor=" + getFurColor() +
                ", birthday=" + getBirthday() +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}
