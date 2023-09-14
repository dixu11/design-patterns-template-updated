package behavioral.chainOfResponsibility.implementation;

public class LoggerFactory {

    public Logger getDefaultLogger() {
        return createDefaultLogger();
    }

    private AbstractLogger createDefaultLogger() {
       return new ErrorLogger(new WarningLogger(new InfoLogger(new DebugLogger(null))));
    }

    public Logger getCustomLogger(LogLvl minLogLvl) {
        AbstractLogger logger = createDefaultLogger();
        logger.findLoggerWith(minLogLvl).unchain();
        return logger;
    }


}
