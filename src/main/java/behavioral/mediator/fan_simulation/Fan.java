package behavioral.mediator.fan_simulation;

public class Fan {

    private boolean on;
    private Mediator mediator;

    public Fan() {
    }

    public void turnOn() {
        mediator.startSupplier();
        on = true;
    }

    public void turnOff() {
        mediator.stopSupplier();
        on = false;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return on;
    }


}
