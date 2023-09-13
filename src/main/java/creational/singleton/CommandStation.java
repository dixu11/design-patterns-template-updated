package creational.singleton;

public class CommandStation {

    private static CommandStation instance = null;//static


    private CommandStation() { //prywatny konstroktor!
        System.out.println("Tworze obiekt");
    }

    public synchronized static CommandStation getInstance() {
        if (instance == null) { //implementacja lazy
            instance = new CommandStation();
        }
        return instance;
    }

    public static void hello() { // wywołanie tej metody powoduje inicjację  statycznych pól a więc w eager implementacji tworzy się obiekt
        System.out.println("hello world");
    }


}
