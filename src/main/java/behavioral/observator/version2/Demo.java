package behavioral.observator.version2;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //stacja generuje pomiary: temperatura, ciśnienie
        //inna klasa komunikuje aktualną pogodę zaraz po pomiarze

        //obiekt obserwowany rozsyła informacje do zainteresowanych (nie na odwrót)
        //obiekt obserwowany nie zna konkretnych klas zainteresowanych, wysyła im dane po interfejsie

        //Solid - single responsibility - każdy obiekt ma jedną odpowiedzialność - jeden powód do zmian
        //sOlid - open closed - kod otwarty na rozszerzanie, bez potrzeby modyfikowania starego kodu
        //soLid - liscov substitution - korzystamy z wspólnego typu bez konieczności znania
        //  konkretnej klasy obiektu z którym mamy do czynienia
        //solId - interface segregation - lepiej mieć wiele małych interfejsów niż jeden duży
        //soliD - dependency iversion - wysokopoziomowy kod nie powinien być zależny od niskopoziomowych szczegółów
        //                         oprzez uniknięcie tworzenia konkretnego obiektu i wstrzykiwanie go po ogólnym typie)

        WeatherAnnouncer weatherAnnouncer = new WeatherAnnouncer();
        WeatherForecaster weatherForecaster = new WeatherForecaster();
        WeatherStation weatherStation = new WeatherStation();
        FireAlarm fireAlarm = new FireAlarm();
        weatherStation.addClient(weatherAnnouncer);
        weatherStation.addClient(weatherForecaster);
        weatherStation.addClient(fireAlarm);
        Thread.sleep(3000);
        weatherStation.removeClient(fireAlarm);
    }
}
