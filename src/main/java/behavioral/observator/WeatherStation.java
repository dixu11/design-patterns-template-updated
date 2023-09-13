package behavioral.observator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {

    private double temp;
    private double pressure;
    private List<WeatherListener> listeners = new ArrayList<>();


    public void addListener(WeatherListener weatherListener) {
        listeners.add(weatherListener);
    }

    public void removeListener(WeatherListener weatherListener) {
        listeners.remove(weatherListener);
    }
    public void updateWeather() {
        Random random = new Random();
        temp = random.nextDouble() * 50 - 10; //0-1 - nextDouble
        pressure = random.nextInt(980, 1020);
        for (WeatherListener listener : listeners) {
            listener.reactToWeatherChanged(new WeatherDTO(temp,pressure));
        }
        //same:
       // listeners.forEach(listener -> listener.reactToWeatherChanged(this));
    }



    @Override
    public String toString() {
        return "WeatherStation{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                '}';
    }
}
