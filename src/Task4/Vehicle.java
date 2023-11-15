package Task4;

public abstract class Vehicle { // транспортоное средсво
    int horsePower;
    int speed;
    boolean hadEngine;

    public Vehicle(int horsePower, int speed, boolean hadEngine) {
        this.horsePower = horsePower;
        this.speed = speed;
        this.hadEngine = hadEngine;
    }

    public abstract void move();
    public abstract void stop();

}
