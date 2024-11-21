public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon: " + weapon.getName() + " (" + weapon.getType() + ")");
    }
}
