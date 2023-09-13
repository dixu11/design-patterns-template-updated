package behavioral.observator;

public class WeatherNotifier {



    public void showWeather(WeatherStation weatherStation) {
        System.out.println("Weather changed!");
        System.out.println("Temp: " + weatherStation.getTemp());
        System.out.println("Pressure: " + weatherStation.getPressure());
    }
}
