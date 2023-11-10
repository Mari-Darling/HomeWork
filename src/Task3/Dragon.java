package Task3;

public class Dragon {
    private int health;
    private int defence;
    private int strength;

    private int weapon;


    public Dragon(int health, int defence, int strength, int weapon) {
        this.health = health;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;

    }

    public void attack(Hero hero) {
        System.out.println("дракон атакует");
        hero.getsDamage(this.strength, this.weapon);
    }

    //Урон = сила_героя + оружие_героя - защита_дракона
    public void getsDamage(int heroStrength, int heroWeapon) {
        System.out.println("дракон атакован");
        System.out.println("здоровье до: " + this.health);
        int damage = heroStrength + heroWeapon - this.defence;
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
