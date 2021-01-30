package solid;

public class Application {

    private Repository repository;

    public Application(Repository repository){
        this.repository = repository;
    }

    public void start() {
        repository.load();
        System.out.println("Aplikacja uruchamia się");
    }

    public void close() {
        repository.save();
        System.out.println("Zamykamy");
    }

}
