package behavioral.observator;

public class WeatherAppDemo {
    public static void main(String[] args) {
        //wzorzec obserwator zakłada że obiekt który się zmienia informuje
        //o tej zmianie zainteresowane obiekty, one nie muszą tego sprawdzać

        //wzorzec zakłada luźną relację obserwowanego z obserwatorami
        //poprzez stworzenie dedykowanego interfejsu

        //przyszły rozwoj aplikacji:
        // nowe klasy konsumujace pomiary -> List<WeatherListener>
        // nowe parametry do konsumowania -> dto

        WeatherNotifier weatherNotifier = new WeatherNotifier();
        WeatherForecaster weatherForecaster = new WeatherForecaster();
        WeatherStation weatherStation = new WeatherStation();
        WeatherFireAlarm fireAlarm = new WeatherFireAlarm();

        weatherStation.addListener(weatherNotifier);
        weatherStation.addListener(weatherForecaster);
        weatherStation.addListener(fireAlarm);

        weatherStation.updateWeather();
        weatherStation.updateWeather();
        weatherStation.removeListener(fireAlarm);
        weatherStation.updateWeather();
        weatherStation.updateWeather();

    }
}
