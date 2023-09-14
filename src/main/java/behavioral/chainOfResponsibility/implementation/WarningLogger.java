package behavioral.chainOfResponsibility.implementation;

public class WarningLogger extends AbstractLogger{
    public WarningLogger(Logger nextLogger) {
        super(nextLogger, LogLvl.WARNING);
    }

    @Override
    void log(String message) {
        System.err.println(message);
    }
}
