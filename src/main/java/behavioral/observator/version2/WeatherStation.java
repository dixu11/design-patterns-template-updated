package behavioral.observator.version2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {

    private double temperatureCelsius;
    private double pressureHp;
    private Random random = new Random();

    private List<WeatherClient> clients = new ArrayList<>();

    public WeatherStation() {
        WeatherStationRunner runner = new WeatherStationRunner();
        runner.start();
    }

    public void addClient(WeatherClient weatherClient) {
        clients.add(weatherClient);
    }

    private void updateWeather() {
        temperatureCelsius = random.nextInt(-20, 40);
        pressureHp = (random.nextDouble() - 0.5) * 20 + 1000; //990 - 1010
        clients.forEach(client -> client.consume(temperatureCelsius,pressureHp));
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "temperatureCelsius=" + temperatureCelsius +
                ", pressureHp=" + pressureHp +
                '}';
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


