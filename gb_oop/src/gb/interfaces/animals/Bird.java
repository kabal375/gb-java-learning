package gb.interfaces.animals;

public abstract class Bird extends Animal {
    private int altitude;

    public Bird(double height, double weight, String eyeColor, String crySound, int altitude) {
        super(height, weight, eyeColor, crySound);
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }
}
