package behavioral.chainOfResponsibility.implementation;

public abstract class AbstractLogger implements Logger{

    private AbstractLogger nextLogger;

    public AbstractLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(String message, LogLvl messageLevel) {
        if (getLoggerLevel() == messageLevel) {
            log(message);
        } else if (nextLogger != null){
            nextLogger.log(message,messageLevel);
        }

     /*   else{
            System.out.println("UWAGA: brak obsługi: " + messageLevel);
        }*/
    }

    AbstractLogger findLoggerWith(LogLvl logLvl) {
        if (getLoggerLevel() == logLvl) {
            return this;
        } else if (nextLogger != null){
            return nextLogger.findLoggerWith(logLvl);
        }else{
            throw new IllegalStateException(logLvl + " not implemented");
        }
    }

    public void unchain() {
        nextLogger = null;
    }

   abstract   LogLvl getLoggerLevel();

    abstract void log(String message);
}
