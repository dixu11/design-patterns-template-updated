package behavioral.chainOfResponsibility.implementation;

public class InfoLogger extends AbstractLogger {
    public InfoLogger(AbstractLogger nextLogger) {
        super(nextLogger );
    }

    @Override
    LogLvl getLoggerLevel() {
        return LogLvl.INFO;
    }

    @Override
    void log(String message) {
        System.out.println(message);
    }
}
