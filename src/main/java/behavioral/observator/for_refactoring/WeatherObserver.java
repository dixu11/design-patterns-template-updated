package behavioral.observator.for_refactoring;


public abstract class WeatherObserver {

     WeatherBroadcaster broadcaster;
    private String widgetType;

    public WeatherObserver(WeatherBroadcaster broadcaster, String widgetType) {
        this.broadcaster = broadcaster;
        this.widgetType = widgetType;
    }

    public abstract void announceNewWeather();
}
