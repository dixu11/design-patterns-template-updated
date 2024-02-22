package behavioral.observator.for_refactoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherBroadcaster implements Runnable {

    private Weather actualWeather;
    private int temperatureCelsius;
    private Thread weatherChanger;
    private Random random = new Random();

    private List<WeatherObserver> observers = new ArrayList<>();

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public WeatherBroadcaster() {
        actualWeather = Weather.SUNNY;
        weatherChanger = new Thread(this);
    }

    public void startBroadcasting(){
        weatherChanger.start();
    }

    private Weather getRandomWeather() {
        Weather[] weathers = Weather.values();
        return weathers[random.nextInt(weathers.length)];
    }


    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(random.nextInt(10_000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            actualWeather = getRandomWeather();
            Random random = new Random();
            temperatureCelsius = random.nextInt(50) + 10;
            weatherChanged();
        }
    }




    public void weatherChanged() {
        //TA METODA WYWOLANA PRZY ZMIANIE POGODY
        System.out.println("Zmiana pogody na : " + actualWeather);
        for (WeatherObserver observer : observers) {
            observer.announceNewWeather();
        }
    }

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }
    public Weather getActualWeather() {
        return actualWeather;
    }

}
