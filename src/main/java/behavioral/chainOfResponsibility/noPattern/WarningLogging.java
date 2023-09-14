package behavioral.chainOfResponsibility.noPattern;

public class WarningLogging implements Logging {
    @Override
    public void log(String message) {
        System.err.println("WARNING: " + message);
    }
}
