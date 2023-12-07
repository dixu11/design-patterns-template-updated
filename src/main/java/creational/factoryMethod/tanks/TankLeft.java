package creational.factoryMethod.tanks;

public class TankLeft extends Tank {
    public TankLeft() {
        super(new BarrelLeft());
    }
}
