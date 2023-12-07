package creational.factoryMethod.tanks;

public class TankRight extends Tank{

    @Override
    Barrel createBarrel() {
        return new BarrelRight();
    }
}
