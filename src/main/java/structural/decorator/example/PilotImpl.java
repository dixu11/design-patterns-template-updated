package structural.decorator.example;

import java.util.function.Consumer;

public class PilotImpl implements Pilot{


    private Runnable action1;
    private Runnable action2;

    public PilotImpl(Runnable action1, Runnable action2) {
        this.action1 = action1;
        this.action2 = action2;
    }

    @Override
    public void pushButton1() {
        action1.run();
    }

    @Override
    public void pushButton2() {
        action2.run();
    }
}
