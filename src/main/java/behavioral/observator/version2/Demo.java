package behavioral.observator.version2;

public class Demo {
    public static void main(String[] args) {
        //stacja generuje pomiary: temperatura, ciśnienie
        //inna klasa komunikuje aktualną pogodę zaraz po pomiarze

        //obiekt obserwowany rozsyła informacje do zainteresowanych (nie na odwrót)

        WeatherStation weatherStation = new WeatherStation();
       // WeatherAnnouncer weatherAnnouncer = new WeatherAnnouncer();
    }
}
