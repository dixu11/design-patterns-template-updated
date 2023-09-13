package creational.factoryMethod.tanksExample;

import creational.factoryMethod.tanksExample.tank.LeftTank;
import creational.factoryMethod.tanksExample.tank.RightTank;
import creational.factoryMethod.tanksExample.tank.Tank;

public class TanksDemo {
    public static void main(String[] args) {
        Tank tank1 = new LeftTank();
        //tank1.setBarrel(new BarrelLeft());
        Tank tank2 = new RightTank();
        //tank2.setBarrel(new BarrelRight());
        tank1.shot(); // shoots right
        tank2.shot(); // shoots left
    }
}
