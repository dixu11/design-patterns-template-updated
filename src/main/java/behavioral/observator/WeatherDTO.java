package behavioral.observator;

public class WeatherDTO {
    private final double temp;
    private final double pressure;

    public WeatherDTO(double temp, double pressure) {
        this.temp = temp;
        this.pressure = pressure;
    }

    public double getTemp() {
        return temp;
    }

    public double getPressure() {
        return pressure;
    }
}
