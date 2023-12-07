package behavioral.observator.version2;

import java.util.Random;

public class WeatherStation {

    private double temperatureCelsius;
    private double pressureHp;

    public WeatherStation() {
        WeatherStationRunner runner = new WeatherStationRunner();
        runner.start();
    }

    private void updateWeather() {
        Random random = new Random();
        temperatureCelsius = random.nextInt(-20, 40);
        pressureHp = (random.nextDouble() - 0.5) * 20 + 1000; //990 - 1010
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
            Thread thread = new Thread(() -> updateWeather());
            thread.start();
        }

    }
}


