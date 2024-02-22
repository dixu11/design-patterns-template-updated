package behavioral.observator.live_coding;

//ogłasza wyniki pomiarów
class WeatherAnnouncer implements WeatherClient {
    @Override
    public void reactToWeatherChanged(WeatherData weatherData) {
        announceWeather(weatherData);
    }

    public void announceWeather(WeatherData weatherData) {
          System.out.printf("%.2f temp %.2f%% humidity pressure %.2f hp\n",
                  weatherData.getTemp(), weatherData.getHumidity() * 100, weatherData.getPressure());
    }
}
