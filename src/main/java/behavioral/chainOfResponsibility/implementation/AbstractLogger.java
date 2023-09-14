package behavioral.chainOfResponsibility.implementation;

public abstract class AbstractLogger implements Logger{

    private Logger nextLogger;

    public AbstractLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(String message, LogLvl messageLevel) {
        if (getLoggerLevel() == messageLevel) {
            log(message);
        } else if (nextLogger != null){
            nextLogger.log(message,messageLevel);
        }else{
            System.out.println("UWAGA: brak obsługi: " + messageLevel);
        }
    }

   abstract   LogLvl getLoggerLevel();

    abstract void log(String message);
}
