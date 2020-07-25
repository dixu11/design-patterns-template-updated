package behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        PowerSupplier supplier = new PowerSupplier();
        Fan fan = new Fan(supplier);
        Button button = new Button(fan);
        System.out.println("Power supplier should be off. Is it on? " + supplier.isOn());
        button.push();
        System.out.println("Power supplier should be on. Is it on? " + supplier.isOn());
        button.push();
        System.out.println("Power supplier should be off. Is it on? " + supplier.isOn());
    }
}
