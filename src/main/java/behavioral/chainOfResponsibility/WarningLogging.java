package behavioral.chainOfResponsibility;

public class WarningLogging implements Logging {
    @Override
    public void log(String message) {
        System.err.println("WARNING: " + message);
    }
}
