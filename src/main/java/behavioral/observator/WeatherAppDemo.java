package behavioral.observator;

public class WeatherAppDemo {
    public static void main(String[] args) {
        //wzorzec obserwator zakłada że obiekt który się zmienia informuje
        //o tej zmianie zainteresowane obiekty, one nie muszą tego sprawdzać


        WeatherStation weatherStation = new WeatherStation();
        weatherStation.updateWeather();
        weatherStation.updateWeather();
        weatherStation.updateWeather();
        weatherStation.updateWeather();
        weatherStation.updateWeather();
        weatherStation.updateWeather();

    }
}
