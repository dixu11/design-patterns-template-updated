package behavioral.mediator.fan_simulation.task;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = initMediator();
        Button button = mediator.getButton();
        System.out.println("Power supplier should be off. Is it on? " + mediator.checkPowerSupplyState());
        button.push();
        System.out.println("Power supplier should be on. Is it on? " + mediator.checkPowerSupplyState());
        button.push();
        System.out.println("Power supplier should be off. Is it on? " + mediator.checkPowerSupplyState());
    }

    private static Mediator initMediator() {
        Mediator mediator = new Mediator();
        PowerSupplier supplier = new PowerSupplier(mediator);
        Fan fan = new Fan(mediator);
        Button button = new Button(mediator);
        mediator.setFan(fan);
        mediator.setButton(button);
        mediator.setPowerSupplier(supplier);
        return mediator;
    }
}
