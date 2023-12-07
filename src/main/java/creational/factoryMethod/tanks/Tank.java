package creational.factoryMethod.tanks;

public abstract class Tank {

    private Barrel barrel;

    public void shoot() {
        barrel.shoot();
    }
}
