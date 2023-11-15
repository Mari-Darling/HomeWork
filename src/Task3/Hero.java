package Task3;

import java.util.Random;

public class Hero {
    private int health;
    private int defence;
    private int strength;
    private int weapon;
    private int shield;
    Random random;

    public Hero(int health, int defence, int strength, int weapon, int shield) {
        this.health = health;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
        this.shield = shield;
        this.random = new Random();
    }

    public void attack(Dragon dragon) {
        if (random.nextInt(100) < 75) { // 75% chance to hit
            System.out.println("герой атакует дракона");
            dragon.getsDamage(this.strength, this.weapon);
        } else {
            System.out.println("герой промахнулся!");
        }
    }

    // Урон = сила_героя + оружие_героя - защита_дракона
    public void getsDamage(int dragonStrength, int dragonWeapon) {
        if (this.shield > 0) {
            this.defence += this.shield;
            this.shield = 0;
        }
        System.out.println("герой атакован");
        System.out.println("здоровье героя до: " + this.health);
        int damage = dragonStrength + dragonWeapon - this.defence;
        this.health -= damage;
        System.out.println("здоровье героя после: " + this.health);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health != 0;
    }
}
