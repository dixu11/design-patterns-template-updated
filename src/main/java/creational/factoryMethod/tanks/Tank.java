package creational.factoryMethod.tanks;

abstract class Tank {
    private final Gun gun;
    Tank(){
        gun = createGun();
    }

    abstract Gun createGun();
    void shoot() {
        gun.shoot();
    }
}
