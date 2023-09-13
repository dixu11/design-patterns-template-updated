package solid;

public class Demo {
    public static void main(String[] args) {
        //realizacja wszystkich zasad solid w szczególności soliD

        Application application = new Application(new InDBRepository());
        // start - zaczytanie danych
        application.start();
        // close - zapis danych
        application.close();
    }
}
