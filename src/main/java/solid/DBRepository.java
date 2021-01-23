package solid;

public class DBRepository implements Repository{

    public void load() {
        System.out.println("Wczytuje dane z bazy danych");
    }

    public void save() {
        System.out.println("Zapisuje dane w bazie danych");
    }

}
