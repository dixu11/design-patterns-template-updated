package behavioral.observator;

import java.util.Random;

public class WeatherForecaster implements WeatherListener {

    @Override
    public void reactToWeatherChanged(WeatherDTO weatherDTO) {
        showForecast(weatherDTO);
    }

    public void showForecast(WeatherDTO weatherDTO) {
        Random random = new Random();
        int change = random.nextInt(-3, 4);
        System.out.println("Forecast changed!");
        System.out.println("Temp: " + (weatherDTO.getTemp() + change));
        System.out.println("Pressure: " + (weatherDTO.getPressure() + change));
    }
}
