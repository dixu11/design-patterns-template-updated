package behavioral.observator.live_coding;

class WeatherForecaster implements WeatherClient {

    @Override
    public void reactToWeatherChanged(WeatherData weatherData) {
        calculateAndPrintForecast(weatherData);
    }

    void calculateAndPrintForecast(WeatherData weatherData) {
       double temp = weatherData.getTemp()+ Math.random();
       double humidity = weatherData.getHumidity() + Math.random();
        System.out.printf("Jutro będzie: %.2f temp %.2f%% humidity\n", temp, humidity * 100);

    }
}
