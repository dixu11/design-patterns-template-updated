package behavioral.chainOfResponsibility;

public class InfoLogging implements Logging {
    @Override
    public void log(String message) {
        System.out.println("INFO: " + message);
    }
}
