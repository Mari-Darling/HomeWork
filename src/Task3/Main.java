package Task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Hero hero = new Hero(1000, 100, 120, 250, 150);
        Dragon dragon = new Dragon(2000, 120, 150, 250);
        hero.attack(dragon);
        dragon.attack(hero);

        if (hero.isAlive()) {
            System.out.println("герой жив");
        }
        if (dragon.isAlive()) {
            System.out.println("дракон жив");
        }
    }
}
