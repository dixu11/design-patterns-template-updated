package behavioral.observator;

import java.util.Random;

public class WeatherBroadcaster implements Runnable {

    private Weather actualWeather;
    private Thread weatherChanger;
    private Random random = new Random();

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
        }
    }

    public synchronized Weather getActualWeather() {
        return actualWeather;
    }
}
