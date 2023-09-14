package structural.decorator.example;

import javax.swing.*;
import java.util.Scanner;

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



        // Dynamiczne składanie różnych dekoratorów w trakcie działania programu
        Scanner scanner = new Scanner(System.in);
        Tv customTv = new TvBasic(50);
        System.out.println("Jaki chcesz telewizor. Czy ma odtwarzać yt? T/N");
        String answer = scanner.nextLine();

        TvYoutubeDecorator youtubeFeature = null;
        if (answer.equals("T")) {
            youtubeFeature = new TvYoutubeDecorator(customTv);
            customTv = youtubeFeature;

        }
        System.out.println("Jaki chcesz telewizor. Czy ma mieć poprawione kolory? T/N");
        answer = scanner.nextLine();

        if (answer.equals("T")) {
            customTv = new TvColorEnhancerDecorator(customTv);
        }


        //jak dostawać się zarówno do dodatkowych metod ukrytych pod inną referencją i do nadpisanych?
        //-> dodatkowa warstwa abstrakcji która to ujednolica - pilot
        final Tv finalTv = customTv;
        final TvYoutubeDecorator finalYt = youtubeFeature;
        Pilot customPilot = new PilotImpl(
                () -> finalTv.display(),
                () -> { //fixme upchnąć to logikę do środka pilota
                    if (finalYt != null) {
                        finalYt.displayYoutube();
                    } else {
                        System.out.println("Button not implemented");
                    }
                }
        ) ;
        customPilot.pushButton1(); // display
        customPilot.pushButton2(); //special feature - youtube lub nie przypisano

//        Można zrobić zwykły podstawowy telewizor
//        Można dodać mu funkcję oglądania youtube
//        Można dodać mu funkcję nagrywania




    }
}
