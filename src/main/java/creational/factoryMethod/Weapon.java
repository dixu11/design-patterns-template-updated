package creational.factoryMethod;

public abstract class Weapon {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public abstract void attack(String ownerName);
}
