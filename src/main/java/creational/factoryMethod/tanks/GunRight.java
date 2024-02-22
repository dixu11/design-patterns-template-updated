package creational.factoryMethod.tanks;

class GunRight extends Gun{
    @Override
    void shoot() {
        System.out.println("Strzelam w lewo");
    }
}
