package Task4;

public class Jeep extends Car{
    public Jeep(int horsePower, int speed, boolean hadEngine) {
        super(horsePower, speed, hadEngine);
    }

    @Override
    public void move() {
        System.out.println("Jeep moves");
    }

    @Override
    public void stop() {
        System.out.println("Jeep stops");
    }
}
