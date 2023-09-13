package behavioral.observator;

import java.util.Random;

public class WeatherStation {

    private double temp;
    private double pressure;

    public void updateWeather() {
        Random random = new Random();
        temp = random.nextDouble() * 50 - 10; //0-1 - nextDouble
        pressure = random.nextInt(980, 1020);
    }


    @Override
    public String toString() {
        return "WeatherStation{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                '}';
    }
}
