package behavioral.mediator.fan_simulation;

public class Mediator {
    private Fan fan;
    private Button button;
    private  PowerSupplier supplier;

    public Mediator() {
    }

    public void setFan(Fan fan) {
        this.fan = fan;
        fan.setMediator(this);
    }

    public void setButton(Button button) {
        this.button = button;
        button.setMediator(this);
    }

    public void setSupplier(PowerSupplier supplier) {
        this.supplier = supplier;
    }

    public void startSupplier() {
        supplier.start();
    }

    public void stopSupplier() {
        supplier.stop();
    }

    public boolean isFanOn() {
        return fan.isOn();
    }

    public void turnFanOff() {
        fan.turnOff();
    }

    public void turnFanOn() {
        fan.turnOn();
    }
}
