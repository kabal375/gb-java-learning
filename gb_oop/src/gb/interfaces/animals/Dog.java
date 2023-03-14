package gb.interfaces.animals;

public class Dog extends Pet implements Train {

    boolean isTrained;

    public Dog(double height, double weight, String eyeColor, String name, String breed,
               String furColor, String birthday, boolean isVaccinated, boolean isTrained) {
        super(height, weight, eyeColor, "Woof, woof", name, breed, furColor, birthday, isVaccinated);
        this.isTrained = isTrained;
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
        System.out.println("*Waving its tail*");
    }

    @Override
    public void train() {
        System.out.println("*... is being trained... *");
        this.isTrained = true;
    }

    public boolean isTrained() {
        return isTrained;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyeColor=" + getEyeColor() +
                ", name=" + getName() +
                ", breed=" + getBreed() +
                ", furColor=" + getFurColor() +
                ", birthday=" + getBirthday() +
                ", isVaccinated=" + isVaccinated +
                ", isTrained=" + isTrained +
                '}';
    }
}
