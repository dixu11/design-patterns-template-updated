package solid;

public class FileRepository implements Repository{

    public void load() {
        System.out.println("Wczytuje dane z dysku");
    }

    public void save() {
        System.out.println("Zapisuje dane z dysku");
    }

}
