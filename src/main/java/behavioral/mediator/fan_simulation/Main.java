package behavioral.mediator.fan_simulation;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        PowerSupplier supplier = new PowerSupplier();
        Fan fan = new Fan();
        Button button = new Button();

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setSupplier(supplier);

        System.out.println("Power supplier should be off. Is it on? " + supplier.isOn());
        button.push();
        System.out.println("Power supplier should be on. Is it on? " + supplier.isOn());
        button.push();
        System.out.println("Power supplier should be off. Is it on? " + supplier.isOn());
    }
}
