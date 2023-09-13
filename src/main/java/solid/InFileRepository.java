package solid;

public class InFileRepository implements Repository {
    public void saveInFile() {
        System.out.println("Zapisuję dane na dysku");
    }

    public void loadInFile() {
        System.out.println("Wczytuję dane z dysku");
    }

    @Override
    public void save() {
        saveInFile();
    }

    @Override
    public void load() {
        loadInFile();
    }
}
