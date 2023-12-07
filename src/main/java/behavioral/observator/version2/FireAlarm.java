package behavioral.observator.version2;

public class FireAlarm implements WeatherClient{
    @Override
    public void consume(Weather weather) {
        announceFireAlarm(weather);
    }

    private void announceFireAlarm(Weather weather) {
        if (weather.temperature() > 25) {
            System.out.println("Uwaga na pozary!");
        }
    }
}
