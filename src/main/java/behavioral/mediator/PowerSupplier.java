package behavioral.mediator;

public class PowerSupplier {

    private boolean on;

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
