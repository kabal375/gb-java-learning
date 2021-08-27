package lesson7;




public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void leftovers() {
        System.out.println("Food left: " + food);
    }

    public boolean decreaseFood(int n) {
        if (isFoodAvailable(n)) {
            this.food -= n;
            return true;
        } else {
            System.out.printf ("Not enough food! %d food left. You want %d %n", food, n);
            return false;
        }
    }

    public boolean isFoodAvailable(int n) {
        return n <= food;
    }

    public void addFood(int n) {
        this.food += n;
    }

}
