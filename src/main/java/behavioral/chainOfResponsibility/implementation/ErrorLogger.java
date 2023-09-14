package behavioral.chainOfResponsibility.implementation;

public class ErrorLogger extends AbstractLogger {


    public ErrorLogger(AbstractLogger nextLogger) {
        super(nextLogger);
    }

    @Override
    LogLvl getLoggerLevel() {
        return LogLvl.ERROR;
    }

    @Override
    void log(String message) {
        System.err.println(message.toUpperCase());
    }
}
