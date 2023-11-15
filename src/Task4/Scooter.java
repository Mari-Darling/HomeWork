package Task4;

public class Scooter extends TwoWheelerTransport{

    public Scooter(int horsePower, int speed, boolean hadEngine) {
        super(horsePower, speed, hadEngine);
    }

    @Override
    public void move() {
        System.out.println("scooter moves");
    }

    @Override
    public void stop() {
        System.out.println("scooter stops");
    }
}
