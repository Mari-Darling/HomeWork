package Task4;

public class Plane extends AirTransport{

    public Plane(int horsePower, int speed, boolean hadEngine, boolean isFlying) {
        super(horsePower, speed, hadEngine, isFlying);
    }

    @Override
    public void move() {
        System.out.println("plane moves");
    }

    @Override
    public void stop() {
        System.out.println("plane moves");
    }
}
