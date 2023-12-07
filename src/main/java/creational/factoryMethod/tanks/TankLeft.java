package creational.factoryMethod.tanks;

public class TankLeft extends Tank {

    @Override
    Barrel createBarrel() {
        return new BarrelLeft();
    }
}
