package Task3;

public class Main {
    public static void main(String[] args) {
        new Main().start(1);
        new Main().start(2);
        new Main().start(3);
    }

    public void start(int bigRound) {
        System.out.println("Большой раунд " + bigRound + " начался");
        Hero hero = new Hero(1000, 100, 120, 250, 150);
        Dragon dragon = new Dragon(2000, 120, 150, 250);
        int round = 1;
        while (hero.isAlive() && dragon.isAlive()) {
            System.out.println("Round " + round);
            hero.attack(dragon);
            if (dragon.isAlive()) {
                dragon.attack(hero);
            }
            round++;
            System.out.println("======================");
        }

        if (hero.isAlive()) {
            System.out.println("Hero wins!");
        } else {
            System.out.println("Dragon wins!");
        }
        System.out.println("Большой раунд " + bigRound + " закночился");
        System.out.println();
        System.out.println();
        System.out.println("============================================");
        System.out.println();
        System.out.println();

    }
}
