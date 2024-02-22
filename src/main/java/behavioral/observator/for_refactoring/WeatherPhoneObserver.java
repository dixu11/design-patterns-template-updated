package behavioral.observator.for_refactoring;

public class WeatherPhoneObserver extends WeatherObserver {
    public WeatherPhoneObserver(WeatherBroadcaster broadcaster) {
        super(broadcaster, "Phone widget");
    }

    @Override
    public void announceNewWeather() {
        System.out.println("Hey, i'am your phone, weather changed! Now it's " + broadcaster.getActualWeather());
    }
}
