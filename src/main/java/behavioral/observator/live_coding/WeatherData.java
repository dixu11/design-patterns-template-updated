package behavioral.observator.live_coding;

class WeatherData {
    private final double temp;
    private final double humidity;
    private final double pressure;

    public WeatherData(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public double getTemp() {
        return temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
