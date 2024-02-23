package behavioral.mediator.fan_simulation.task;

public class Fan {

    private boolean on;
    private Mediator mediator;

    public Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {
        mediator.changePowerSupplyState(PowerState.ON);
        //mediator.startSupplier();
        on = true;
    }

    public void turnOff() {
        mediator.changePowerSupplyState(PowerState.OFF);
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
