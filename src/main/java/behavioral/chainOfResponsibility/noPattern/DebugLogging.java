package behavioral.chainOfResponsibility.noPattern;

public class DebugLogging implements Logging {
    @Override
    public void log(String message) {
        System.out.println("(DEBUG: " + message + ")");
    }
}
