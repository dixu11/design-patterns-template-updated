package behavioral.observator;

public class WeatherDemo {
    public static void main(String[] args) {
        WeatherBroadcaster broadcaster = new WeatherBroadcaster();
        WeatherWidget webWidget = new WeatherWebWidget(broadcaster);
        WeatherWidget phoneWidget = new WeatherPhoneWidget(broadcaster);

        broadcaster.startBroadcasting();

        webWidget.startUpdatingWeather();
        phoneWidget.startUpdatingWeather();

    }
}
