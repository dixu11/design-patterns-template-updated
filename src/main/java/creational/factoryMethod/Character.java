package creational.factoryMethod;

public abstract class Character {

    private Weapon weapon;
    private String name;

    public Character(String name) {
        this.name = name;
    }
}
