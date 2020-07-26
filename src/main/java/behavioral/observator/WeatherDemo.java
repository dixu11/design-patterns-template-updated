package behavioral.observator;

public class WeatherDemo {
    public static void main(String[] args) throws InterruptedException {
        WeatherBroadcaster broadcaster = new WeatherBroadcaster(); // obesrwowany
        WeatherObserver webWidget = new WeatherWebObserver(broadcaster); // obserwator
        WeatherObserver phoneWidget = new WeatherPhoneObserver(broadcaster); // obserwator
        GlobalFireWorningAlarm alarm = new GlobalFireWorningAlarm(broadcaster);


        broadcaster.addObserver(webWidget);
        broadcaster.addObserver(phoneWidget);
        broadcaster.addObserver(alarm);

        broadcaster.startBroadcasting();

        Thread.sleep(20_000);
        System.out.println("Jest już zima, odłączamy nasłuch alarmu pozarowego");
        broadcaster.removeObserver(alarm);


    }
}
