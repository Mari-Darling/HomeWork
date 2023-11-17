package Task5;

public abstract class Bike extends Vehicle{
    int howManySpeeds;

    public Bike(int speed, String brand, String model, int howManySpeeds) {
        super(speed, brand, model);
        this.howManySpeeds = howManySpeeds;
    }

    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }
}
