package behavioral.observator.version2;

public class FireAlarm implements WeatherClient{
    @Override
    public void consume(double temperature, double pressure) {
        announceFireAlarm(temperature, pressure);
    }

    private void announceFireAlarm(double temperature, double pressure) {
        if (temperature > 25) {
            System.out.println("Uwaga na pozary!");
        }
    }
}
