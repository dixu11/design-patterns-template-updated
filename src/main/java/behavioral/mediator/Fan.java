package behavioral.mediator;

public class Fan {

    private boolean on;
    private PowerSupplier supplier;

    public Fan(PowerSupplier supplier) {
        this.supplier = supplier;
    }

    public void turnOn() {
        supplier.start();
        on = true;
    }

    public void turnOff() {
        supplier.stop();
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
