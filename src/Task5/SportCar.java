package Task5;

public class SportCar extends Car{
    public SportCar(int horsePower, int speed, boolean hadEngine, int wheels, String color, String brand, String model) {
        super(horsePower, speed, hadEngine, wheels, color, brand, model);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
