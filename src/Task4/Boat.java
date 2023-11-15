package Task4;

public class Boat extends WaterTransoport{
    public Boat(int horsePower, int speed, boolean hadEngine, boolean hasDrowned) {
        super(horsePower, speed, hadEngine, hasDrowned);
    }

    @Override
    public void move() {
        System.out.println("boat moves");
    }

    @Override
    public void stop() {
        System.out.println("boar stops");
    }
}
