package creational.factoryMethod.tanks;

class Main {
    public static void main(String[] args) {
        Tank tankLeft = new TankLeft();
        Tank tankRight = new TankRight();
        tankLeft.shoot(); // strzelam w prawo
        tankRight.shoot(); // strzelam w lewo
    }
}
