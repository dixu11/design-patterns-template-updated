package behavioral.chainOfResponsibility.implementation;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(AbstractLogger nextLogger) {
        super(nextLogger);
    }

    @Override
    LogLvl getLoggerLevel() {
        return LogLvl.DEBUG;
    }

    @Override
    void log(String message) {
        System.out.printf("(%s)%n",message);
    }
}
