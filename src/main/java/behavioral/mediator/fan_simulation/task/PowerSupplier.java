package behavioral.mediator.fan_simulation.task;

public class PowerSupplier {

    private boolean on;
    private Mediator mediator;

    public PowerSupplier(Mediator mediator) {
        this.mediator = mediator;
    }

    public void start() {
        on = true;
    }

    public void stop() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
