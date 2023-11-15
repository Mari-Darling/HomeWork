package Task4;

public class SportCar extends Car{
    public SportCar(int horsePower, int speed, boolean hadEngine) {
        super(horsePower, speed, hadEngine);
    }

    @Override
    public void move() {
        System.out.println("sport car moves");
    }

    @Override
    public void stop() {
        System.out.println("sport car stops");
    }
}
