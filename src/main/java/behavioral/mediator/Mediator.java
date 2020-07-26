package behavioral.mediator;

public class Mediator {

    private Fan fan;
    private PowerSupplier supplier;


    public boolean isFanOn() {
       return fan.isOn();
    }

    public void turnFanOn() {
        fan.turnOn();
    }

    public void turnFanOff() {
        fan.turnOff();
    }

    public void startSupplier() {
        supplier.start();
    }

    public void stopSupplier() {
        supplier.stop();
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setSupplier(PowerSupplier supplier) {
        this.supplier = supplier;
    }
}
