package behavioral.observator.version2;

public class WeatherForecaster implements WeatherClient {
    @Override
    public void consume(Weather weather) {
        forecast(weather);
    }

    private void forecast(Weather weather) {
        System.out.printf("Jutro będzie: %.2f stopni i ciśnienie: %.2fhp\n"
                ,weather.temperature()+2,weather.pressure() +1);
    }
}
