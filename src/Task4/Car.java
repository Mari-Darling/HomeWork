package Task4;

public class Car extends Vehicle{

    public Car(int horsePower, int speed, boolean hadEngine) {
        super(horsePower, speed, hadEngine);
    }

    @Override
    public void move() {
        System.out.println("car moves");
    }

    @Override
    public void stop() {
        System.out.println("car stops");

    }
}
