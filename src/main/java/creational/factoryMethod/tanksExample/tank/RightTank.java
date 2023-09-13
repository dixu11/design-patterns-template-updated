package creational.factoryMethod.tanksExample.tank;

public class RightTank extends Tank{

   /* public RightTank() {
        barrel = new BarrelRight();
    }*/

    @Override
    public Barrel createBarrel() {
        return new BarrelRight();
    }

}
