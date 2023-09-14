package structural.decorator.example;

public class TvColorEnhancerDecorator implements Tv{

    private Tv tv;

    public TvColorEnhancerDecorator(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void display() {
        tv.display();
        System.out.println("Wyświetlenie z wyostrzonymi kolorami");
    }

    @Override
    public int getResolution() {
        return tv.getResolution();
    }
}
