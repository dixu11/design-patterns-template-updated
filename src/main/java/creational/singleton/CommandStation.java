package creational.singleton;

public class CommandStation {
   private static CommandStation commandStation = null;
    private CommandStation() throws InterruptedException {
        System.out.println("Powstaje obiekt");
        Thread.sleep(1000);
    }

    public synchronized static CommandStation getInstance() throws InterruptedException {

           if (commandStation == null) {
               commandStation = new CommandStation();
           }

        return commandStation;
    }

    public static void testMethod(){
        System.out.println("Test method invoked");
    }
}
