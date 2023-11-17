package Task5;

public abstract class Scooter extends Vehicle{
    protected boolean hasEngine;
    public Scooter(int speed, String brand, String model, boolean hasEngine) {
        super(speed, brand, model);
        this.hasEngine = hasEngine;
    }

    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }
}
