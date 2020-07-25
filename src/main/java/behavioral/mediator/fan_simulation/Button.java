package behavioral.mediator.fan_simulation;

public class Button {

    private Fan fan;

    public Button(Fan fan) {
        this.fan = fan;
    }

    public void push() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }


}
