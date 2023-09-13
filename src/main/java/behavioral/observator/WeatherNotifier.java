package behavioral.observator;

public class WeatherNotifier implements WeatherListener {



    @Override
    public void reactToWeatherChanged(WeatherDTO weatherDTO) {
        showWeather(weatherDTO);
    }

    public void showWeather(WeatherDTO weatherDTO) {
        System.out.println("Weather changed!");
        System.out.println("Temp: " + weatherDTO.getTemp());
        System.out.println("Pressure: " + weatherDTO.getPressure());
    }
}
