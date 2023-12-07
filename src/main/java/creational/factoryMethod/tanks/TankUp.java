package creational.factoryMethod.tanks;

public class TankUp extends Tank{

    @Override
    Barrel createBarrel() {
        return new BarrelLeft();
    }
}
