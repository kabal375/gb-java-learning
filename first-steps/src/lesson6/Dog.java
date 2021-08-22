package lesson6;

public class Dog extends Animal {

    private final int dogRunMaxDistance = 500;
    private final int dogSwimMaxDistance = 10;
    private static int dogCount;

    public Dog(String name) {
        super(name);
        this.setAnimalMaxRunDistance(this.dogRunMaxDistance);
        this.setAnimalMaxSwimDistance(this.dogSwimMaxDistance);
        dogCount++;
    }

    public int getDogCount() {
        return dogCount;
    }
}
