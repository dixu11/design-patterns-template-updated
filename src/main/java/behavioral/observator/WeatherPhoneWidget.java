package behavioral.observator;

public class WeatherPhoneWidget extends WeatherWidget {
    public WeatherPhoneWidget(WeatherBroadcaster broadcaster) {
        super(broadcaster, "Phone widget");
    }

    @Override
    public void announceNewWeather() {
        System.out.println("Hey, i'am your phone, weather changed! Now it's " + lastWeather + "!");
    }
}
