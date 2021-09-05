package lesson8;

public class Human implements Actions {

    private int maxJumpHeight;
    private int maxRunDistance;
    private boolean isReady;

    public Human(int maxHeight, int maxDistance) {
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
            System.out.println("Human run");
            return true;
        } else {
            System.out.println("Human failed to run");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= this.maxJumpHeight) {
            System.out.println("Human jumped");
            return true;
        } else {
            System.out.println("Human failed to jump");
            return false;
        }
    }

}

