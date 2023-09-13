package creational.factoryMethod.tanksExample.tank;

public abstract class Tank {

   private Barrel barrel;

    public Tank(){
        barrel = createBarrel();
    }

    public abstract Barrel createBarrel();

    public void setBarrel(Barrel barrel) {
        this.barrel = barrel;
    }

    public void shot() {
        barrel.shot();
    }


}
