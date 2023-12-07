package behavioral.observator.version2;

public class WeatherAnnouncer {

    public void announce(double temp, double pressure) {
        System.out.printf("Temp: %.2f  Ciśnienie wynosi: %.2f\n",
                temp, pressure);
    }


}
