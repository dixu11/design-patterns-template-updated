package behavioral.observator;

public class WeatherWebObserver extends WeatherObserver {


    public WeatherWebObserver(WeatherBroadcaster broadcaster) {
        super(broadcaster, "Web widget");
    }

    @Override
    public void announceNewWeather() {
        System.out.println("Hey, i'am your favorite website! Did you know, that it's " + broadcaster.getActualWeather()+" now?");
    }
}
