package behavioral.observator;


public abstract class WeatherWidget implements Runnable{

    private WeatherBroadcaster broadcaster;
    protected Weather lastWeather;
    private Thread updater;
    private long pingCounter = 0;
    private String widgetType;

    public WeatherWidget(WeatherBroadcaster broadcaster, String widgetType) {
        this.broadcaster = broadcaster;
        lastWeather = broadcaster.getActualWeather();
        this.widgetType = widgetType;
        updater = new Thread(this);
    }

    public void startUpdatingWeather(){
        updater.start();
    }

    @Override
    public void run() {
        for (;;){
            pingCounter++;
            if (broadcaster.getActualWeather() != lastWeather) {
                System.out.println("[Weather changed after " + pingCounter + " pings to broadcaster for " + widgetType + "]");
                lastWeather = broadcaster.getActualWeather();
                pingCounter = 0;
                announceNewWeather();
            }
        }
    }


    public abstract void announceNewWeather();
}
