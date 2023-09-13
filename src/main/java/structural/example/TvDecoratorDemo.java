package structural.example;

public class TvDecoratorDemo {
    public static void main(String[] args) {
        Tv tv = new TvBasic(45);
        tv.display();

        TvYoutubeDecorator tvWithYt = new TvYoutubeDecorator(new TvBasic(65));
        tvWithYt.displayYoutube();


        //rozszerzenie dynamicznie - w trakcie działania programu o nową metodę
        TvYoutubeDecorator ytTv = new TvYoutubeDecorator(tv);
        ytTv.displayYoutube();


        tv = new TvColorEnhancerDecorator(tv);
        tv.display();


//        Można zrobić zwykły podstawowy telewizor
//        Można dodać mu funkcję oglądania youtube
//        Można dodać mu funkcję nagrywania




    }
}
