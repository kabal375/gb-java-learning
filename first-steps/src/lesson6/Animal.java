package lesson6;

public class Animal {

    private String name;
    private int animalMaxRunDistance;
    private int animalMaxSwimDistance;
    private static int animalCount;


    public Animal (String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= this.animalMaxRunDistance) {
            System.out.printf("%s пробежал %d м %n", this.name, distance);
        } else {
            System.out.printf("%s может пробежать %d м максимум %n", this.name, this.animalMaxRunDistance);
        }
    }

    public void swim(int distance) {
        if (distance <= this.animalMaxSwimDistance) {
            System.out.printf("%s проплыл %d м %n", this.name, distance);
        } else {
            System.out.printf("%s может проплыть %d м максимум %n", this.name, this.animalMaxSwimDistance);
        }
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public void setAnimalMaxRunDistance(int animalMaxRunDistance) {
        this.animalMaxRunDistance = animalMaxRunDistance;
    }

    public void setAnimalMaxSwimDistance(int animalMaxSwimDistance) {
        this.animalMaxSwimDistance = animalMaxSwimDistance;
    }
}
