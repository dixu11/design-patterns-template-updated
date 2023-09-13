package creational.factoryMethod.tanksExample.tank;

public class BarrelLeft extends Barrel{
    @Override
    public void shot() {
        System.out.println("Strzela w prawo");
    }
}
