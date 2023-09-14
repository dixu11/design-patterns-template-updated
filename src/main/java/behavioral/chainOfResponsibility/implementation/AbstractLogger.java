package behavioral.chainOfResponsibility.implementation;

public abstract class AbstractLogger implements Logger{

    private Logger nextLogger;
    private LogLvl loggerLevel;

    public AbstractLogger(Logger nextLogger, LogLvl loggerLevel) {
        this.nextLogger = nextLogger;
        this.loggerLevel = loggerLevel;
    }

    @Override
    public void log(String message, LogLvl messageLevel) {
        if (loggerLevel == messageLevel) {
            log(message);
        } else {
            nextLogger.log(message,messageLevel);
        }
    }

    abstract void log(String message);
}
