package behavioral.observator.live_coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

enum Mode {
    RANDOM, CONSTANT
}

//robi pomiary
class WeatherStation {

    private static final int MAX_TIME_MILLIS = 1000;
    private Mode mode;
    private final Random random = new Random();
    private List<WeatherClient> weatherClients = new ArrayList<>();

    public WeatherStation(Mode mode) {
        this.mode = mode;
    }

    void add(WeatherClient client) {
        weatherClients.add(client);
    }

    void makeInfiniteMeasurements() throws InterruptedException {
        while (true) {
            makeMeasurement();
            waitForNextMeasurement();
        }
    }

    private void makeMeasurement() {
        double temp = random.nextDouble() * 60 - 10; //-10 -> 30
        double humidity = random.nextDouble() / 2; // 0.0 - 0.5
        double pressure = random.nextDouble()*20 + 990; //990 - 1010
        WeatherData weatherData = new WeatherData(temp, humidity, pressure);
        weatherClients.forEach(client -> client.reactToWeatherChanged(weatherData));

    }

    private void waitForNextMeasurement() throws InterruptedException {
        int sleepTimeMillis = howLongToWait();
        Thread.sleep(sleepTimeMillis);
    }

    private int howLongToWait() {
        if (mode == Mode.RANDOM) {
           return random.nextInt(MAX_TIME_MILLIS);
        } else if (mode == Mode.CONSTANT) {
            return MAX_TIME_MILLIS;
        } else {
            throw new IllegalStateException("Unrecognized mode");
        }
    }
}
