package Task4;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike(1, 10, false);
        Scooter scooter = new Scooter(2, 15, true);
        Ship ship = new Ship(2000, 19, true, false);
        bike.move();
        bike.stop();
        scooter.move();
        scooter.stop();
        ship.hasDrowned();
    }
}
