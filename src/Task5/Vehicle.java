package Task5;


public abstract class Vehicle { // транспортоное средсво

    int speed;
    String brand;

    String model;

    public Vehicle( int speed,   String brand, String model) {
        this.speed = speed;
        this.brand = brand;
        this.model = model;
    }

    public abstract void move();

    public abstract void stop();



}