package Task6;

import java.util.Random;

public abstract class Chessman {

    private Random random = new Random();
    private int xCoordinate;
    private int yCoordinate;
    private String icon;
    private String color;

    private String name;

    public Chessman(int xCoordinate, int yCoordinate, String icon, String color) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.icon = icon;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    private int getXCoordinate() {
        return this.xCoordinate;
    }

    private int getYCoordinate() {
        return this.yCoordinate;
    }

    public void getCoordinates() {
        System.out.printf("x = %d, y = %d\n", getXCoordinate(), getYCoordinate());
    }


    public String getIcon() {
        return this.icon;
    }

    public String getColor() {
        return this.color;
    }

    public void move() {
        if (this.random.nextBoolean()) {
            this.xCoordinate++;
        } else {
            this.yCoordinate++;
        }

    }

    @Override
    public String toString() {
        return "\nимя: " + name +
                ", \nцвет: " + color +
                ", \nизображение: " + icon +
                ",  \nкоордината х: " + xCoordinate +
                ", \nкоордината у: " + yCoordinate;
    }
}
