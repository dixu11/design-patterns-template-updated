package creational.singleton;

public class Demo {

    public static void main(String[] args) {
        //kod po prawej stronie od '=' należy podmienić

        CommandStation station = CommandStation.getInstance();
        CommandStation station2 = CommandStation.getInstance();

        //wykonaj implementacje wzorca Singleton, w klasie CommandStation tak, aby
        //poniższy warunek został spełniony

        if (station == station2) {
            System.out.println("Bingo! Ta sama referencja");
        } else {
            System.out.println("Niepoprawnie zaimplementowany wzorzec Singleton - powstały dwa obiekty");
        }


    }
}
