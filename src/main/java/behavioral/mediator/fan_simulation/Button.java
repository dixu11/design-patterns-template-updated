package behavioral.mediator.fan_simulation;

public class Button {

    private Mediator mediator;

    public Button() {
    }

    public void setMediator(Mediator mediator) {
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
