package behavioral.mediator.fan_simulation.task;

public interface MediatorAbstract {

    void changePowerSupplyState(PowerState state);
    void changeFanState(PowerState state);
    void pressButton();
    boolean checkPowerSupplyState();
}
