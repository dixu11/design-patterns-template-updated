package solid;

public class Demo {
    public static void main(String[] args) {
        Application application = new Application(new FileRepository());
        application.start();
        application.close();
    }
}
