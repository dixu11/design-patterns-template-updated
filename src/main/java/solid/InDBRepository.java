package solid;

public class InDBRepository implements Repository {

    @Override
    public void load() {
        System.out.println("Wczytuję dane z BD");
    }
    public void save() {
        System.out.println("Zapis danych w BD");
    }


}
