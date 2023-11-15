package Task4;

public class Ship extends WaterTransoport{
    public Ship(int horsePower, int speed, boolean hadEngine, boolean hasDrowned) {
        super(horsePower, speed, hadEngine, hasDrowned);
    }

    @Override
    public void move() {
        System.out.println("ship moves");
    }

    @Override
    public void stop() {
        System.out.println("ship stops");
    }
}
