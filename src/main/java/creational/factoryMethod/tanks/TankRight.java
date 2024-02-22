package creational.factoryMethod.tanks;

class TankRight extends Tank{
    @Override
    Gun createGun() {
        return new GunRight();
    }
}
