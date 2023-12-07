package creational.factoryMethod.tanks;

public class Demo {
    public static void main(String[] args) {
        Tank tank = new TankLeft();
        Tank tank2 = new TankRight();
        tank.shoot();
        tank2.shoot();

        //strzelam w prawo
        //strzelam w lewo
    }
}
