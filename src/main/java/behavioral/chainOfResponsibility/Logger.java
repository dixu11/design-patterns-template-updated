package behavioral.chainOfResponsibility;


public class Logger {

    private LogLvl minLogLvl;
    private Logging errorLogging;
    private Logging warningLogging;
    private Logging infoLogging;
    private Logging debugLogging;

    public Logger() {
        minLogLvl = LogLvl.DEBUG;
        setUpLoggers();
    }

    public Logger(LogLvl minLogLvl) {
        this.minLogLvl = minLogLvl;
        setUpLoggers();
    }

    private void setUpLoggers() {
        errorLogging = new ErrorLogging();
        warningLogging = new WarningLogging();
        infoLogging = new InfoLogging();
        debugLogging = new DebugLogging();
    }

    public void log(String message, LogLvl lvl) {
        if (lvl == LogLvl.ERROR) {
            errorLogging.log(message);
        } else if (lvl == LogLvl.WARNING &&  (minLogLvl == LogLvl.DEBUG || minLogLvl == LogLvl.INFO || minLogLvl == LogLvl.WARNING)  ) {
            warningLogging.log(message);
        } else if (lvl == LogLvl.INFO && (minLogLvl == LogLvl.DEBUG || minLogLvl == LogLvl.INFO) ) {
            infoLogging.log(message);
        } else if (lvl == LogLvl.DEBUG && (minLogLvl == LogLvl.DEBUG) ) {
            debugLogging.log(message);
        }
    }

    public void setMinLogLvl(LogLvl minLogLvl) {
        this.minLogLvl = minLogLvl;
    }
}
