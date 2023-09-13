package behavioral.observator;

public class WeatherFireAlarm implements WeatherListener{
    @Override
    public void reactToWeatherChanged(WeatherDTO weatherDTO) {
        if (weatherDTO.getTemp() > 25) {
            System.out.println("Uwaga zagrożenie pożarowe!");
        } else {
            System.out.println("<alarm milczy>");
        }
    }
}
