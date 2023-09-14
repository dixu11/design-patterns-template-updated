package behavioral.chainOfResponsibility.implementation;

public class InfoLogger extends AbstractLogger {
    public InfoLogger(Logger nextLogger) {
        super(nextLogger,LogLvl.INFO );
    }

    @Override
    void log(String message) {
        System.out.println(message);
    }
}
