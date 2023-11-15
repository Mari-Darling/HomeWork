package Task4;

public class Bike extends TwoWheelerTransport {
    public Bike(int horsePower, int speed, boolean hadEngine) {
        super(horsePower, speed, hadEngine);
    }

    @Override
    public void move() {
        System.out.println("bike moves");
    }

    @Override
    public void stop() {
        System.out.println("bike stops");
    }
}
