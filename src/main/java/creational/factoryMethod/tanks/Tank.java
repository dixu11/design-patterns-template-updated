package creational.factoryMethod.tanks;

public abstract class Tank {

    private Barrel barrel;

    public Tank() {
        barrel = createBarrel();
    }

   abstract Barrel createBarrel();

    public void shoot() {
        barrel.shoot();
    }
}
