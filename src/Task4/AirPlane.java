package Task4;

public class AirPlane extends AirTransport{
    public AirPlane(int horsePower, int speed, boolean hadEngine, boolean isFlying) {
        super(horsePower, speed, hadEngine, isFlying);
    }

    @Override
    public void move() {
        System.out.println("flying");
    }

    @Override
    public void stop() {
        System.out.println("on the ground");
    }
}
