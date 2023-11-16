package Task5;


public abstract class Vehicle { // транспортоное средсво
    int horsePower;
    int speed;
    int wheels;
    boolean hadEngine;
    String color;

    String brand;

    String model;

    public Vehicle(int horsePower, int speed, boolean hadEngine, int wheels, String color, String brand, String model) {
        this.horsePower = horsePower;
        this.speed = speed;
        this.hadEngine = hadEngine;
        this.wheels = wheels;
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public abstract void move();

    public abstract void stop();

    public static class Avto {
    }

    public static class SportCar {
    }
}