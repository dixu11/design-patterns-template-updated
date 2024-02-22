package behavioral.observator.live_coding;

import java.util.Random;

enum Mode {
    RANDOM, CONSTANT
}

class WeatherStation {

    private static final int MAX_TIME_MILLIS = 1000;
    private Mode mode;
    private final Random random = new Random();

    public WeatherStation(Mode mode) {
        this.mode = mode;
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
        System.out.printf("%.2f temp %.2f%% humidity\n", temp, humidity);
    }

    private void waitForNextMeasurement() throws InterruptedException {
        if (mode == Mode.RANDOM) {
            Thread.sleep(random.nextInt(MAX_TIME_MILLIS));
        } else if (mode == Mode.CONSTANT) {
            Thread.sleep(MAX_TIME_MILLIS);
        } else {
            throw new IllegalStateException("Unrecognized mode");
        }
    }

}
