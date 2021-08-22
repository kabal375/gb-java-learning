package lesson6;

public class Cat extends Animal {

    public static final int catRunMaxDistance = 200;
    public static final int catSwimMaxDistance = 0;
    private static int catCount;

    public Cat(String name) {
        super(name);
        this.setAnimalMaxRunDistance(catRunMaxDistance);
        this.setAnimalMaxSwimDistance(catSwimMaxDistance);
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать, ибо кот %n", getName());
    }

    public int getCatCount() {
        return catCount;
    }
}
