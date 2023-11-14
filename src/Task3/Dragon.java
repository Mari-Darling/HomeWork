package Task3;

import java.util.Random;

public class Dragon {
    private int health;
    private int defence;
    private int strength;
    private int weapon;
    Random random;

    public Dragon(int health, int defence, int strength, int weapon) {
        this.health = health;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
        this.random = new Random();

    }

    public void attack(Hero hero) {
        if (random.nextBoolean()) { // 50% chance to attack
            System.out.println("дракон атакует героя");
            hero.getsDamage(this.strength, this.weapon);
        } else {
            System.out.println("Дракон ничего не делает");
        }

    }

    // Урон = сила_героя + оружие_героя - защита_дракона
    public void getsDamage(int heroStrength, int heroWeapon) {
        System.out.println("дракон атакован");
        System.out.println("здоровье дракона до: " + this.health);
        int damage = heroStrength + heroWeapon - this.defence;
        this.health -= damage;
        System.out.println("здоровье дракноа после: " + this.health);
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
