package creational.factoryMethod.tanksExample.tank;

public class LeftTank extends Tank{
    public LeftTank() {
        barrel = new BarrelLeft();
    }
}
