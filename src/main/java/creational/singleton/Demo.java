package creational.singleton;

public class Demo {

   private static CommandStation station;
   private static CommandStation station2;

    public static void main(String[] args) throws InterruptedException {
        //eager - podstawowa 'gorliwa' implementacja Singleton
        //lazy - zabezpiecza przed tworzeniem obiektu gdy nie jest on potrzebny - nie jest bezpieczna wielowątkowo
        //enum - enum z jednym polem - odpowiednik implementacji eager
        //kod po prawej stronie od '=' należy podmienić



        new Thread(() -> {
            try {
                station = CommandStation.getInstance();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

       new Thread(() -> {
            try {
                station2 = CommandStation.getInstance();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();



        //wykonaj implementacje wzorca Singleton, w klasie CommandStation tak, aby
        //poniższy warunek został spełniony

        if (station == station2) {
            System.out.println("Bingo! Ta sama referencja");
        } else {
            System.out.println("Niepoprawnie zaimplementowany wzorzec Singleton - powstały dwa obiekty");
        }
        CommandStation.testMethod();
        System.out.println("Hello");



    }
}
