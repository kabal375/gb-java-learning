package lesson8;

public class Cat implements Actions {

    private int maxJumpHeight;
    private int maxRunDistance;
    private boolean isReady;

    public Cat(int maxHeight, int maxDistance) {
        this.maxJumpHeight = maxHeight;
        this.maxRunDistance = maxDistance;
        isReady = true;

    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public boolean run(int distance) {
        if (distance <= this.maxRunDistance) {
            System.out.println("Cat run");
            return true;
        } else {
            System.out.println("Cat failed to run");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= this.maxJumpHeight) {
            System.out.println("Cat jumped");
            return true;
        } else {
            System.out.println("Cat failed to jump");
            return false;
        }
    }

}
