package behavioral.observator;

public class GlobalFireWorningAlarm extends WeatherObserver{
    public GlobalFireWorningAlarm(WeatherBroadcaster broadcaster) {
        super(broadcaster, "Fire alarm");
    }

    @Override
    public void announceNewWeather() {
        if (broadcaster.getTemperatureCelsius() > 35) {
            System.out.println("Fire alarm!");
            System.out.println(broadcaster.getTemperatureCelsius());
        }

    }
}
