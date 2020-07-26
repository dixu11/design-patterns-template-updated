package behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        PowerSupplier supplier = new PowerSupplier();
        Mediator mediator = new Mediator();
        Fan fan = new Fan(mediator);
        Button button = new Button(mediator);
        mediator.setFan(fan);
        mediator.setSupplier(supplier);
        System.out.println("Power supplier should be off. Is it on? " + supplier.isOn());
        button.push();
        System.out.println("Power supplier should be on. Is it on? " + supplier.isOn());
        button.push();
        System.out.println("Power supplier should be off. Is it on? " + supplier.isOn());
    }
}
