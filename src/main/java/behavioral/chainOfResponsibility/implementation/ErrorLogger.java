package behavioral.chainOfResponsibility.implementation;

public class ErrorLogger extends AbstractLogger {


    public ErrorLogger(Logger nextLogger) {
        super(nextLogger, LogLvl.ERROR);
    }

    @Override
    void log(String message) {
        System.err.println(message.toUpperCase());
    }
}
