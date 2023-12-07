package behavioral.observator.version2;

public class WeatherAnnouncer implements WeatherClient {


    @Override
    public void consume(Weather weather) {
        announce(weather);
    }

    private void announce(Weather weather) {
        System.out.printf("Temp: %.2f  Ciśnienie wynosi: %.2f Wilgotność: %.2f cm opadów Szansa na opad śniegu: %.0f %% \n",
                weather.temperature(), weather.pressure(), weather.humidity(), weather.chanceForSnow()*100);
    }
}
