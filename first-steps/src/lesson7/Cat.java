package lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Plate p) {
        this.satiety = p.decreaseFood(appetite);
        return satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }
}
