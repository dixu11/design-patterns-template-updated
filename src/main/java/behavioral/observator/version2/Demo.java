package behavioral.observator.version2;

public class Demo {
    public static void main(String[] args) {
        //stacja generuje pomiary: temperatura, ciśnienie
        //inna klasa komunikuje aktualną pogodę zaraz po pomiarze

        //obiekt obserwowany rozsyła informacje do zainteresowanych (nie na odwrót)

        //Solid - single responsibility - każdy obiekt ma jedną odpowiedzialność - jeden powód do zmian
        //sOlid - open closed - kod otwarty na rozszerzanie, bez potrzeby modyfikowania starego kodu
        //soLid - liscov substitution - korzystamy z wspólnego typu bez konieczności znania
                //  konkretnej klasy obiektu z którym mamy do czynienia
        //solId - interface segregation - lepiej mieć wiele małych interfejsów niż jeden duży

        WeatherStation weatherStation = new WeatherStation();
       // WeatherAnnouncer weatherAnnouncer = new WeatherAnnouncer();
    }
}
