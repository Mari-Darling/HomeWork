package Task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main().start();

        // hero.attack(dragon);
        // dragon.attack(hero);
        // hero.attack(dragon);
        // dragon.attack(hero);

        // if (hero.isAlive()) {
        // System.out.println("герой жив");
        // }
        // if (dragon.isAlive()) {
        // System.out.println("дракон жив");
        // }

    }

    public void start() {
        Hero hero = new Hero(1000, 100, 120, 250, 150);
        Dragon dragon = new Dragon(2000, 120, 150, 250);
        int round = 1;
        while (hero.isAlive() && dragon.isAlive()) {
            System.out.println("Round " + round);
            hero.attack(dragon);
            if (dragon.isAlive()) {
                dragon.attack(hero);;
            }
            round++;
            System.out.println("======================");
        }

        if (hero.isAlive()) {
            System.out.println("Hero wins!");
        } else {
            System.out.println("Dragon wins!");
        }
    }
}
