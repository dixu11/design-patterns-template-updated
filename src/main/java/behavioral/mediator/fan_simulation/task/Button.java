package behavioral.mediator.fan_simulation.task;

public class Button {
    private Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void push() {
        if (mediator.isFanOn()) {
            mediator.turnFanOff();
        } else {
            mediator.turnFanOn();
        }
    }


}
