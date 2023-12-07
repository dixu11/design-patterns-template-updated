package behavioral.observator.version2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {

    private double temperatureCelsius;
    private double pressureHp;
    private  double humidity;
    private double chanceForSnow;
    private final Random random = new Random();

    private final List<WeatherClient> clients = new ArrayList<>();

    public WeatherStation() {
        WeatherStationRunner runner = new WeatherStationRunner();
        runner.start();
    }

    private void updateWeather() {
        temperatureCelsius = random.nextInt(-20, 40);
        pressureHp = (random.nextDouble() - 0.5) * 20 + 1000; //990 - 1010
        humidity = random.nextDouble() * 3;
        chanceForSnow = random.nextDouble();
        clients.forEach(client -> client.consume(new Weather(
                temperatureCelsius,pressureHp,humidity,chanceForSnow
        )));
    }

    public void addClient(WeatherClient weatherClient) {
        clients.add(weatherClient);
    }

    public void removeClient(FireAlarm fireAlarm) {
        clients.remove(fireAlarm);
    }

    public WeatherStation(double temperatureCelsius, double pressureHp, double humidity) {
        this.temperatureCelsius = temperatureCelsius;
        this.pressureHp = pressureHp;
        this.humidity = humidity;
    }

    class WeatherStationRunner {

        public void start() {
            Thread thread = new Thread(() -> doUpdates());
            thread.start();
        }

        private void doUpdates() {
            for (; ; ) {
                updateWeather();
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
            }
        }

    }
}


