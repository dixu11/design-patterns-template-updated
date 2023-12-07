package behavioral.observator.version2;

public class WeatherForecaster implements WeatherClient {
    @Override
    public void consume(double temperature, double pressure) {
        forecast(temperature, pressure);
    }

    private void forecast(double temp, double pressure) {
        System.out.printf("Jutro będzie: %.2f stopni i ciśnienie: %.2fhp\n"
                ,temp+2,pressure +1);
    }
}
