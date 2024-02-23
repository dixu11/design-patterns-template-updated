package behavioral.mediator.fan_simulation.task;

import java.util.ArrayList;
import java.util.Objects;

public class Mediator implements MediatorAbstract{
    private PowerSupplier powerSupplier;
    private Fan fan;
    private Button button;

    @Override
    public void changePowerSupplyState(PowerState state) {
        if (Objects.requireNonNull(state) == PowerState.ON) {
            powerSupplier.start();
        } else if (state == PowerState.OFF) {
            powerSupplier.stop();
        }
    }

    @Override
    public void changeFanState(PowerState state) {
        if (Objects.requireNonNull(state) == PowerState.ON) {
            fan.turnOn();
        } else if (state == PowerState.OFF) {
            fan.turnOff();
        }
    }

    @Override
    public void pressButton() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    @Override
    public boolean checkPowerSupplyState() {
        return powerSupplier.isOn();
    }


    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
       // fan.setMediator(this);
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Button getButton() {
        return button;
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
