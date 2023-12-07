package creational.factoryMethod.tanks;

public abstract class Tank {

    private Barrel barrel;

    public Tank(Barrel barrel) {
        this.barrel = barrel;
    }

    public void shoot() {
        barrel.shoot();
    }
}
