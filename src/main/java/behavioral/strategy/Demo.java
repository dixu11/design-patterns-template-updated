package behavioral.strategy;

public class Demo {
    public static void main(String[] args) {
        /*Zaimplementuj wzorzec Strategy tak, aby działanie metody display zależało od
        * referencji przechowującej aktualny obiekt strategii.
        *
        * Zadbaj o to, żeby zmieniać strategię z normalnego wyświetlania na wygaszacz po przekroczeniu
        * ilości sekund do wygaszacza oraz wyświetlanie "Ekran nieaktywny" po przekroczeniu ilości sekund
        * do wyłączenia monitora
        * */

        Monitor monitor = new Monitor(30, 90);
        monitor.testMonitorFor(500);
    }
}
