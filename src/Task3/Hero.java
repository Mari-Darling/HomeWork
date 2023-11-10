package Task3;

public class Hero {
    private int health;
    private int defence;
    private int strength;
    private int weapon;
    private int shield;

    public Hero(int health, int defence, int strength, int weapon, int shield) {
        this.health = health;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
        this.shield = shield;
    }

    public void attack(Dragon dragon) {
        System.out.println("герой атакует");
        dragon.getsDamage(this.strength, this.weapon);
    }

    //Урон = сила_героя + оружие_героя - защита_дракона
    public void getsDamage(int dragonStrength, int dragonWeapon) {
        if (this.shield > 0) {
            this.defence += this.shield;
            this.shield = 0;
        }
        System.out.println("герой атакован");
        System.out.println("здоровье до: " + this.health);
        int damage = dragonStrength + dragonWeapon - this.defence;
        this.health -= damage;
        System.out.println("здоровье после: " + this.health);
        System.out.println();

        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health != 0;
    }
}
