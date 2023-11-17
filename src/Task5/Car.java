package Task5;

public abstract class Car extends Vehicle{
    int horsePower;
    int wheels;
    boolean hadEngine;
    String color;



    public Car(int horsePower, int speed, boolean hadEngine, int wheels, String color, String brand, String model) {
        super(speed, brand,model);
        this.horsePower = horsePower;
        this.hadEngine = hadEngine;
        this.wheels = wheels;
        this.color = color;


    }



    @Override
    public void move() {

    }

    @Override
    public void stop() {


    }
}