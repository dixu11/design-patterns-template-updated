package creational.factoryMethod.tanksExample.tank;

public abstract class Tank {

    Barrel barrel;

    public void setBarrel(Barrel barrel) {
        this.barrel = barrel;
    }

    public void shot() {
        barrel.shot();
    }


}
