package structural.decorator.example;

public class TvBasic implements Tv{

    private int resolution;

    public TvBasic(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public void display() {
        System.out.println("Ekran : " + resolution + " cali");
        System.out.println("Telewizor wyświetla normalne kanały");
    }

    @Override
    public int getResolution() {
        return resolution;
    }
}
