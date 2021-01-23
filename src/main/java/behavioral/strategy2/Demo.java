package behavioral.strategy2;

public class Demo {
    public static void main(String[] args) {
        /*Zaimplementuj wzorzec Strategy tak, aby działanie metody renderScreen zależało od
        * referencji przechowującej aktualny obiekt strategii.
        *
        * Zadbaj o to, żeby zmieniać strategię z normalnego wyświetlania(RenderScreenStrategy) na wygaszacz(RenderScreenSaverStrategy)
        *  po przekroczeniu podanej ilości sekund (30) oraz wyświetlanie "Ekran nieaktywny", ze strategii wyłączonego ekranu (RenderNothingStrategy)
        *  po przekroczeniu ilości sekund do wyłączenia monitora (60)
        *
        * Sekundy reprezentowane są przez prostą symulację za pomocą pętli for. Dla urozmaicenia w teście od czasu do czasu
        * będzie symulowana sytuacja, że użytkownik używa komputera, co zeruje licznik - nie musisz tego pisać, to jest gotowe.
        * Twoim zadaniem jest uzupełnienie 2 metod w klasie Monitor, klas strategii oraz powiązanie ich ze sobą.
        * */

        Monitor monitor = new Monitor(30, 90);
        monitor.testMonitorFor(500);
    }
}
