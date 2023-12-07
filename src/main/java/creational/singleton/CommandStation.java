package creational.singleton;

public class CommandStation {
   private static CommandStation commandStation = new CommandStation();
    private CommandStation() {
        System.out.println("Powstaje obiekt");
    }

    public static CommandStation getInstance() {
        return commandStation;
    }
}
