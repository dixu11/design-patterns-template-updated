package structural.decorator.example;

public class TvYoutubeDecorator  implements Tv{

    private Tv tv;

    public TvYoutubeDecorator(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void display() {
        tv.display();
    }

    @Override
    public int getResolution() {
        return tv.getResolution();
    }

    public void displayYoutube() {
        System.out.println("Ekran : " + tv.getResolution() + " cali");
        System.out.println("Wyświetlam film z yt");
    }
}
