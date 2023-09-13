package behavioral.observator;

public class WeatherAppDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.updateWeather();
        System.out.println(weatherStation);
    }
}
