package solid;

//decyduje co robimy przy starcie i na zamknięcie aplikacji
public class Application {

    private Repository repository;


    //dzieki wstrzyknieciu zaleznosci kod niskopoziomowy wybierający rodzaj repozytorium został zepchnięty do main (new InDBRepository())
    public Application(Repository repository) {
        this.repository = repository;
    }

    public void start() {
        System.out.println("Start aplikacji");
        repository.load();
    }


    public void close() {
        System.out.println("Zamykamy");
        repository.save();
    }

}
