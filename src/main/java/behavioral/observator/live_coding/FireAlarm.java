package behavioral.observator.live_coding;

class FireAlarm implements WeatherClient{
    @Override
    public void reactToWeatherChanged(WeatherData weatherData) {
        if (weatherData.getTemp() > 20) {
            System.out.println("Uwaga zagrożenie pożarowe");
        }
    }
}
