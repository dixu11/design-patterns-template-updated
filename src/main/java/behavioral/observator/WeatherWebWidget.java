package behavioral.observator;

public class WeatherWebWidget extends WeatherWidget{


    public WeatherWebWidget(WeatherBroadcaster broadcaster) {
        super(broadcaster, "Web widget");
    }

    @Override
    public void announceNewWeather() {
        System.out.println("Hey, i'am your favorite website! Did you know, that it's " + lastWeather + " now?");
    }
}
