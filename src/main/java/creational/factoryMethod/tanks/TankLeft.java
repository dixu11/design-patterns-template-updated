package creational.factoryMethod.tanks;

class TankLeft  extends Tank{

    @Override
    Gun createGun() {
        return new GunLeft();
    }
}
