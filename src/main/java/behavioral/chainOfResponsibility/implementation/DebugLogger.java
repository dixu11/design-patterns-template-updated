package behavioral.chainOfResponsibility.implementation;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(Logger nextLogger) {
        super(nextLogger, LogLvl.DEBUG);
    }

    @Override
    void log(String message) {
        System.out.printf("(%s)%n",message);
    }
}
