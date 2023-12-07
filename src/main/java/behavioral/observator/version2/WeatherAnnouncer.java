package behavioral.observator.version2;

public class WeatherAnnouncer implements WeatherClient {


    @Override
    public void consume(double temperature, double pressure) {
        announce(temperature,pressure);
    }

    private void announce(double temp, double pressure) {
        System.out.printf("Temp: %.2f  Ciśnienie wynosi: %.2f\n",
                temp, pressure);
    }
}
