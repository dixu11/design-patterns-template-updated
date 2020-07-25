package behavioral.template_method;

import java.util.Scanner;

public class TextConverter {

    public void runConverter() {
        //TODO przerób te metodę na metodę szablonową -> przygotuj 2 klasy implementujące ten szablon

        //Przewidziane kroki algorytmu:
        //krok 1: Wczytanie danych
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz zdanie - postaram się, wyświetlić je od tyłu :)");
        String sentence = scanner.nextLine();

        //krok 2: przetworzenie zdania
        String[] words = sentence.split(" ");
        String sentenceBackward = "";
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            sentenceBackward += word + " ";
        }

        //krok 3: zaprezentuj rezultaty
        System.out.println("Twoje zdanie: ");
        System.out.println(sentenceBackward);
    }

}
