package lesson8;

public class Robot implements Actions {

    private int maxJumpHeight;
    private int maxRunDistance;
    boolean isReady;

    public Robot(int maxHeight, int maxDistance) {
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
            System.out.println("Robot run");
            return true;
        } else {
            System.out.println("Robot failed to run");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= this.maxJumpHeight) {
            System.out.println("Robot jumped");
            return true;
        } else {
            System.out.println("Robot failed to jump");
            return false;
        }
    }

}
